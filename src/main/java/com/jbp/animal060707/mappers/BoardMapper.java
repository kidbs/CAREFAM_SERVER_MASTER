package com.jbp.animal060707.mappers;

import com.jbp.animal060707.entities.BoardEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    int boardInsert(BoardEntity input);
    int boardUpdate(BoardEntity input);

    int boardDelete(int index);

    int boardCount();

    List<BoardEntity> boardSearch(String input);

    List<BoardEntity> getAllBoard();
}
