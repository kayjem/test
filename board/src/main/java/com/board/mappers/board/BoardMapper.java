package com.board.mappers.board;

import com.board.domain.BoardVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoardMapper {

    List<BoardVO> list();

    void write(BoardVO vo);

    BoardVO view(@Param(value = "bno") int bno);

    void modify(BoardVO vo);

    void delete(@Param(value = "bno") int bno);

    int count();

    List<?> listPage(@Param(value = "displayPost") int displayPost, @Param(value = "postNum") int postNum);

    List<BoardVO> listPageSearch(@Param(value = "displayPost") int displayPost,
                                 @Param(value = "postNum") int postNum,
                                 @Param(value = "searchType") String searchType,
                                 @Param(value = "keyword") String keyword);

    int searchCount(@Param(value = "searchType") String searchType, @Param(value = "keyword") String keyword);
}
