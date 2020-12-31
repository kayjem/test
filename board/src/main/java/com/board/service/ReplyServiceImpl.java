package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.ReplyDAO;
import com.board.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyService dao;

	// 댓글 조회
	@SuppressWarnings("unchecked")
	public List<ReplyVO> list(int bno) throws Exception {
		return dao.list(bno);
	}

	@Override
	public void write(ReplyVO vo) throws Exception {
		dao.write(vo);
	}

	@Override
	public void modify(ReplyVO vo) throws Exception {
		dao.modify(vo);
	}

	@Override
	public void delete(ReplyVO vo) throws Exception {
		dao.delete(vo);
	}

	@Override
	public List<ReplyVO> list1(int bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
