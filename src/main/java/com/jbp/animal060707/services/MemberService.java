package com.jbp.animal060707.services;

import com.jbp.animal060707.entities.IdEntity;
import com.jbp.animal060707.entities.LoginEntity;
import com.jbp.animal060707.entities.MemberEntity;
import com.jbp.animal060707.mappers.MemberMapper;
import com.jbp.animal060707.vos.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;
    public int memberSubmit(MemberEntity input){

        Date date =new Date();
        input.setCreateDate(date);
        return memberMapper.memberSubmit(input);

    }

    public int memberLogin(LoginEntity input){
        return memberMapper.memberLogin(input);

    }
    public int memberModifyPw(MemberEntity input){

        Date date = new Date();
        input.setUpdateDate(date);
        return memberMapper.memberModifyPw(input);
    }

    public List<MemberEntity> memberSearch(String input){

       return memberMapper.memberSearch(input);
    }

    public int duplicateId(IdEntity input){


        return memberMapper.duplicateId(input);
    }



}