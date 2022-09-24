package kr.co.minseok.board.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.minseok.board.dto.BoardDTO;
import kr.co.minseok.board.dto.PagingDTO;
import kr.co.minseok.board.service.BoardService;
import kr.co.minseok.member.dto.MemberDTO;

@Controller
public class BoardController {

	@Autowired
	private BoardDTO boardDTO;
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping(value = "/writing")
	public String writing() {
		return "board/writing";
	}
	
	@PostMapping(value = "/writing")
	public String boardWrite(HttpServletRequest request, HttpServletResponse response,
								BoardDTO boardDTO) throws Exception {
		
		boardService.writeBoard(boardDTO);
		return "redirect:/homepage";
	}
	
	/*
	 * @GetMapping(value = "/homepage") public String hompage(Model model) throws
	 * Exception {
	 * 
	 * List<BoardDTO> list = boardService.boardList();
	 * 
	 * model.addAttribute("list", list);
	 * 
	 * return "board/homepage"; }
	 */
	
	@GetMapping(value = "/homepage")
	public String hompage(Model model, PagingDTO paging,
						  @RequestParam(value = "nowPage", required = false)String nowPage,
						  @RequestParam(value = "cntPerPage", required = false)String cntPerPage) throws Exception {
		
		int total = boardService.countBoard(paging);
		
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "5";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) { 
			cntPerPage = "5";
		}
		
		paging = new PagingDTO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		
		List<BoardDTO> list = boardService.selectBoard(paging);
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		
		return "board/homepage";
	}
	
	@GetMapping(value = "readBoard")
	public String readBoard(@ModelAttribute("list") BoardDTO boardDTO, Model model, int post_num) throws Exception {
		
		List<BoardDTO> list = boardService.readBoard(boardDTO);
		
		model.addAttribute("list", list);
		
		return "board/readboard";
		
	}
	
	@GetMapping(value = "callingBoard")
	public String callingBoard(Model model, @ModelAttribute("list") BoardDTO boardDTO) throws Exception {
		
		List<BoardDTO> list = boardService.callingBoard(boardDTO);
		
		model.addAttribute("list", list);
		
		return "board/modifyboard";
	}
}
