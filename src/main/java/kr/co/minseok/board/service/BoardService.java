package kr.co.minseok.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import kr.co.minseok.board.dao.BoardDAO;
import kr.co.minseok.board.dto.BoardDTO;

@Service("boardService")
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public void writeBoard(BoardDTO boardDTO) throws DataAccessException {
		boardDAO.boardWrite(boardDTO);
	}
}
