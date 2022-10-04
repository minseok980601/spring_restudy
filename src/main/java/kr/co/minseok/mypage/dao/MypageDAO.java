package kr.co.minseok.mypage.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import kr.co.minseok.member.dto.MemberDTO;

@Repository("mypageDAO")
public class MypageDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public void changePwd(MemberDTO memberDTO) throws DataAccessException {
		sqlSession.update("mapper.member.changePwd", memberDTO);
	}
}
