package com.jbp.animal060707.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class BoardEntity {

            private int index;
            private String writer;
            private String title;
            private String content;
            private String scope;
            private Date createDate;
            private Date updateDate;

}
