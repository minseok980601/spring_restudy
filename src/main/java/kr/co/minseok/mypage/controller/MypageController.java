package kr.co.minseok.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.minseok.member.dto.MemberDTO;
import kr.co.minseok.mypage.service.MypageService;

@Controller
public class MypageController {

	@Autowired
	MemberDTO memberDTO;
	
	@Autowired
	MypageService mypageService;
	
	@GetMapping(value = "/mypage")
	public String mypage() {
		return "mypage/mypage";
	}
	
	@PostMapping(value = "/changePwd")
	public String changePwd(MemberDTO memberDTO) throws Exception {
		
		mypageService.changePwd(memberDTO);
		
		return "redirect:/login";
	}
	
}
