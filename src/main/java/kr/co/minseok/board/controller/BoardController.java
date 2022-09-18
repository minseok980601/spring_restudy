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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.minseok.board.dto.BoardDTO;
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
		return "board/homepage";
	}
	
	@GetMapping(value = "/homepage")
	public String hompage(Model model) throws Exception {
		
		List<BoardDTO> list = boardService.boardList();
		
		model.addAttribute("list", list);
		
		return "board/homepage";
	}
}
