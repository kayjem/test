package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {

	List<BoardVO> list() throws Exception;
	void write(BoardVO vo) throws Exception;

	BoardVO view(int bno) throws Exception;
}