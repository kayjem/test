package com.board.service;

import javax.inject.Inject;

import com.board.mappers.board.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

//	 @Inject
//	 private BoardDAO dao;

	 @Autowired
	 private BoardMapper boardMapper;

	 //게시물 목록
	 @Override
	 public List<BoardVO> list() throws Exception {
		 return boardMapper.list();
	 }
	 
	 //게시물 작성
	 @Override
	 public void write(BoardVO vo) throws Exception {
		 boardMapper.write(vo);
	 }

	// 게시물 조회
	 @Override
	 public BoardVO view(int bno) throws Exception {
		 return boardMapper.view(bno);
	 }
	 
	// 게시물 수정
	 @Override
	 public void modify(BoardVO vo) throws Exception {
		 boardMapper.modify(vo);
	 }
	 
	// 게시물 삭제
	 public void delete(int bno) throws Exception {
		 boardMapper.delete(bno);
	 }
	 
	// 게시물 총 갯수
	 @Override
	 public int count() throws Exception {
	  return boardMapper.count();
	 }	 
	 
	// 게시물 목록 + 페이징
	 @Override
	 public List<?> listPage(int displayPost, int postNum) throws Exception {
	  return boardMapper.listPage(displayPost, postNum);
	 }	 

	// 게시물 목록 + 페이징 + 검색
	 @Override
	 public List<BoardVO> listPageSearch(int displayPost, int postNum, String searchType, String keyword) throws Exception {
	  return  boardMapper.listPageSearch(displayPost, postNum, searchType, keyword);
	 }
	 
	// 게시물 총 갯수
	 @Override
	 public int searchCount(String searchType, String keyword) throws Exception {
	  return boardMapper.searchCount(searchType, keyword);
	 }	 
}