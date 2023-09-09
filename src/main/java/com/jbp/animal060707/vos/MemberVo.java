package com.jbp.animal060707.vos;

import com.jbp.animal060707.entities.MemberEntity;
import lombok.Data;

@Data
public class MemberVo extends MemberEntity {
    String search;
}
