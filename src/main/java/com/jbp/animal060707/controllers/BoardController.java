package com.jbp.animal060707.controllers;

import com.jbp.animal060707.entities.BoardEntity;
import com.jbp.animal060707.entities.MemberEntity;
import com.jbp.animal060707.services.BoardService;
import com.jbp.animal060707.vos.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/board")
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @ResponseBody
    @PostMapping("/test")
    public String test(){
        return "test";
    }


    @ResponseBody
    @PostMapping("/insert")
    public int boardInsert(@RequestBody BoardEntity input){
        return boardService.boardInsert(input);
    }

    @ResponseBody
    @PostMapping("/update")
    public int boardUpdate(@RequestBody BoardEntity input){
        return boardService.boardUpdate(input);
    }

    @ResponseBody
    @PostMapping("/search")
    public List<BoardEntity> boardSearch(@RequestBody BoardVo input){

        return boardService.boardSearch(input.getSearch());
    }

    @ResponseBody
    @PostMapping("/delete")
    public int boardDelete(@RequestBody BoardEntity input){
        return boardService.boardDelete(input.getIndex());
    }

    @ResponseBody
    @PostMapping("/load")
    public List<BoardEntity> getAllBoard() {
        List<BoardEntity> boardList = boardService.getAllBoard();
        return boardList;
    }

    @ResponseBody
    @PostMapping("/count")
    public int boardCount() {
        return boardService.boardCount();
    }

}
