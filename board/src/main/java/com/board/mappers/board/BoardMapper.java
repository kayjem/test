package com.board.mappers.board;

import com.board.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM tbl_board")
    List<BoardVO> getAllBoard();
}
