package com.jbp.animal060707.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor

public class MemberEntity {

    int index;
    String id;
    String name;
    String email;
    String pw;
    Date createDate;
    Date updateDate;
}
