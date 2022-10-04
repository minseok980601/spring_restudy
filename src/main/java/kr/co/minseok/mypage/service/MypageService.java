package kr.co.minseok.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import kr.co.minseok.member.dto.MemberDTO;
import kr.co.minseok.mypage.dao.MypageDAO;

@Service("mypageService")
public class MypageService {

	@Autowired
	private MypageDAO mypageDAO;
	
	public void changePwd(MemberDTO memberDTO) throws DataAccessException {
		mypageDAO.changePwd(memberDTO);
	}
}
