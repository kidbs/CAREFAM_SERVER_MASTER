package com.jbp.animal060707.mappers;

import com.jbp.animal060707.entities.IdEntity;
import com.jbp.animal060707.entities.LoginEntity;
import com.jbp.animal060707.entities.MemberEntity;
import com.jbp.animal060707.vos.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    int memberSubmit(MemberEntity input);

    int memberLogin(LoginEntity input);

    int memberModifyPw(MemberEntity input);

    List<MemberEntity> memberSearch(String input);
    int duplicateId(IdEntity input);
}
