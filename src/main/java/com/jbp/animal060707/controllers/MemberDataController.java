package com.jbp.animal060707.controllers;

import com.jbp.animal060707.dtos.MemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberDataController {
    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody MemberDto requestBody) {
        // 회원가입 처리 로직 작성
        // requestBody 객체에서 회원 정보 추출 및 저장

        return ResponseEntity.ok().build(); // 회원가입 성공 시 200 응답 반환
    }
}


