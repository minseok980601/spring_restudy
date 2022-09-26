package kr.co.minseok.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import kr.co.minseok.board.dao.BoardDAO;
import kr.co.minseok.board.dto.BoardDTO;
import kr.co.minseok.board.dto.PagingDTO;

@Service("boardService")
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public void writeBoard(BoardDTO boardDTO) throws DataAccessException {
		boardDAO.boardWrite(boardDTO);
	}
	
	public List<BoardDTO> boardList() throws DataAccessException {
		return boardDAO.boardList();
	}
	
	public BoardDTO readBoard(BoardDTO boardDTO) throws DataAccessException {
		return boardDAO.showBoard(boardDTO);
	}
	
	public int countBoard(PagingDTO pagingDTO) throws DataAccessException {
		return boardDAO.countBoard(pagingDTO);
	}
	
	public List<BoardDTO> selectBoard(PagingDTO pagingDTO) throws DataAccessException {
		return boardDAO.selectBoard(pagingDTO);
	}
	
	public BoardDTO callingBoard(int post_num) throws DataAccessException {
		return boardDAO.callingBoard(post_num);
	}
	
	public void writeBoardUpdate(BoardDTO boardDTO) throws DataAccessException {
		boardDAO.writeBoardUpdate(boardDTO);
	}
	
	public void deleteBoard(int post_num) throws DataAccessException {
		boardDAO.deleteBoard(post_num);
	}
}
