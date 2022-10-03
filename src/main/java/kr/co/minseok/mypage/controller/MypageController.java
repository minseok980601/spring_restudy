package kr.co.minseok.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.minseok.member.dto.MemberDTO;

@Controller
public class MypageController {

	@Autowired
	MemberDTO memberDTO;
	
	@GetMapping(value = "/mypage")
	public String mypage() {
		return "mypage/mypage";
	}
	
}
