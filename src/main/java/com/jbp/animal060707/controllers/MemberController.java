package com.jbp.animal060707.controllers;

import com.jbp.animal060707.entities.IdEntity;
import com.jbp.animal060707.entities.LoginEntity;
import com.jbp.animal060707.entities.MemberEntity;
import com.jbp.animal060707.services.MemberService;
import com.jbp.animal060707.vos.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/member")
@Controller
public class MemberController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @Autowired
    private MemberService memberService;
    @ResponseBody
    @PostMapping("/submit")
    public int memberSubmit(@RequestBody MemberEntity input){

        return memberService.memberSubmit(input);
    }

    @ResponseBody
    @PostMapping("/login")
    public int memberLogin(@RequestBody LoginEntity input,HttpSession session){
        int checkLogin=memberService.memberLogin(input);


        if (checkLogin==1) {
            // 세션에 로그인 확인여부
            session.setAttribute("checkedLogin", true);
            return 1; // 로그인 완료
        } else if(checkLogin==0){
            session.setAttribute("checkedLogin", false);
            return 0; // 없는 id 혹은 pw
        }else {
            return 2;// 혹시 중복
        }



    }

    @ResponseBody
    @PostMapping("/modifyPw")
    public int memberModifyPw(@RequestBody MemberEntity input){
        return memberService.memberModifyPw(input);
    }

    @ResponseBody
    @PostMapping("/search")
    public List<MemberEntity> memberSearch(@RequestBody MemberVo input){
        return memberService.memberSearch(input.getSearch());
    }
    // 회원 ID 중복 확인 API
    @ResponseBody
    @PostMapping("/checkDuplicateId")
    public int checkDuplicateId(@RequestBody IdEntity input, HttpSession session) {
        // ID가 이미 존재하는지 데이터베이스에서 검색
        int isDuplicate = memberService.duplicateId(input);

        if (isDuplicate!=0) {
            // 세션에 중복 ID 여부 저장
            session.setAttribute("isDuplicateId", true);
            return 1; // 중복 ID인 경우
        } else {
            session.setAttribute("isDuplicateId", false);
            return 0; // 사용 가능한 ID인 경우
        }
    }



}