package kr.co.minseok.member.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import kr.co.minseok.member.dto.MemberDTO;

@Repository("memberDAO")
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public void insertMember(MemberDTO memberDTO) throws DataAccessException {
		sqlSession.insert("mapper.member.joinMember", memberDTO);
	}
	
	public List<MemberDTO> selectMember() throws DataAccessException {
		return sqlSession.selectList("mapper.member.joinMemberList");
	}
	
	public MemberDTO loginMember(MemberDTO memberDTO, HttpSession session)  {
		return sqlSession.selectOne("mapper.member.loginMember", memberDTO);
	}
}
