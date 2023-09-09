package com.jbp.animal060707.controllers;

import com.jbp.animal060707.dtos.MemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberDataController {
    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@ModelAttribute MemberDto requestBody) {
        // 회원가입 로직 수행
        // requestBody에서 필요한 데이터 추출하여 처리

        // 회원가입 성공 시
        return ResponseEntity.ok().build();

        // 회원가입 실패 시
        // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    // 다른 핸들러 메서드들...
}