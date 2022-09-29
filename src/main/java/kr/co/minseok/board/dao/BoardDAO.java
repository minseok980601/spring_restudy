package kr.co.minseok.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import kr.co.minseok.board.dto.BoardDTO;
import kr.co.minseok.board.dto.PagingDTO;

@Repository("boardDAO")
public class BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;

	public void boardWrite(BoardDTO boardDTO) throws DataAccessException {
		sqlSession.insert("mapper.board.writeBoard", boardDTO);
	}
	
	public List<BoardDTO> boardList() throws DataAccessException {
		return sqlSession.selectList("mapper.board.boardList");
	}
	
	public BoardDTO showBoard(BoardDTO boardDTO) throws DataAccessException {
		return sqlSession.selectOne("mapper.board.showBoard", boardDTO);
	}
	
	public int countBoard(PagingDTO pagingDTO) throws DataAccessException {
		return sqlSession.selectOne("mapper.board.countBoard", pagingDTO);
	}
	
	public List<BoardDTO> selectBoard(PagingDTO pagingDTO) throws DataAccessException {
		return sqlSession.selectList("mapper.board.selectBoard", pagingDTO);
	}
	
	/*
	 * public List<BoardDTO> callingBoard(BoardDTO boardDTO) throws
	 * DataAccessException { return
	 * sqlSession.selectList("mapper.board.CallingBoard", boardDTO); }
	 */
	
	public BoardDTO callingBoard(int post_num) throws DataAccessException {
		return sqlSession.selectOne("mapper.board.CallingBoard", post_num);
	}
	
	public void writeBoardUpdate(BoardDTO boardDTO) throws DataAccessException {
		sqlSession.update("mapper.board.writeBoardUpdate", boardDTO);
	}
	
	public void deleteBoard(int post_num) throws DataAccessException {
		sqlSession.delete("mapper.board.deleteBoard", post_num);
	}
	
	public void upcountBoard(int post_num) throws DataAccessException {
		sqlSession.update("mapper.board.upcountBoard", post_num);
	}
}
