package com.byz.sboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private int pid;

    private String pname;

    private String personAddr;

    private int gender;

    private Date birth;

}
