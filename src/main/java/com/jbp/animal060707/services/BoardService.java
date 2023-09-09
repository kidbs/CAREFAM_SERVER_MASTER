package com.jbp.animal060707.services;

import com.jbp.animal060707.entities.BoardEntity;
import com.jbp.animal060707.mappers.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardMapper boardMapper;

    public int boardInsert(BoardEntity input){
        Date date= new Date();
        input.setCreateDate(date);

        return boardMapper.boardInsert(input);
    }

    public int boardUpdate(BoardEntity input){
        Date date=new Date();
        input.setUpdateDate(date);

        return boardMapper.boardUpdate(input);
    }

    public List<BoardEntity> boardSearch(String input){

        return boardMapper.boardSearch(input);
    }

    public int boardDelete(int index){
        return boardMapper.boardDelete(index);
    }

    ///////////////////////////////////////////////

    public List<BoardEntity> getAllBoard() {
        return boardMapper.getAllBoard();
    }

    public int boardCount() {
        return boardMapper.boardCount();
    }

}
