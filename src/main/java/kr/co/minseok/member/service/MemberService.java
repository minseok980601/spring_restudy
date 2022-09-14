package kr.co.minseok.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import kr.co.minseok.member.dao.MemberDAO;
import kr.co.minseok.member.dto.MemberDTO;

@Service("memberService")
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	public void addMember(MemberDTO memberDTO) throws DataAccessException {
		memberDAO.insertMember(memberDTO);
	}
	
	public List<MemberDTO> joinMemberList() throws DataAccessException {
		return memberDAO.selectMember();
	}
}
