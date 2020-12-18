package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {
	//게시물 목록
	List<BoardVO> list() throws Exception;
	
	//게시물 작성
	void write(BoardVO vo) throws Exception;
	
	// 게시물 조회
	BoardVO view(int bno) throws Exception;
}