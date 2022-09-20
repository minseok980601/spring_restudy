package kr.co.minseok.member.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.minseok.member.dto.MemberDTO;
import kr.co.minseok.member.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberDTO memberDTO;
	
	@GetMapping(value = "/join")
	public String login() throws Exception {
		return "join/join";
	}
	
	@PostMapping(value = "/join")
	public String joinMember(MemberDTO memberDTO, HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		memberService.addMember(memberDTO);
		return "join/join";
	}
	
	@GetMapping(value = "/joinlist")
	public String joinLogin(Model model, MemberDTO memberDTO) throws Exception {
		
		List<MemberDTO> joinMemberList = memberService.joinMemberList();
		model.addAttribute("joinList", joinMemberList);
		
		return "join/joinlist";
	}
	
	@GetMapping(value = "/login")
	public String memLogin() throws Exception {
		return "join/login";
	}
	
	@PostMapping(value = "/login")
	public String memberLogin(HttpServletRequest request, HttpServletResponse response, 
								HttpSession session, @ModelAttribute MemberDTO memberDTO) throws Exception {
		
		MemberDTO loginMember = memberService.loginMember(memberDTO, session);
		session.setAttribute("loginMember", loginMember);
		
		return "redirect:/homepage";
	}
	

	

	
}
