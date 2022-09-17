package kr.co.minseok.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import kr.co.minseok.board.dto.BoardDTO;

@Repository("boardDAO")
public class BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;

	public void boardWrite(BoardDTO boardDTO) throws DataAccessException {
		sqlSession.insert("mapper.board.writeBoard", boardDTO);
	}
}