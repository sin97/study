package com.ljq.study.se.reflect;

import lombok.Data;

@Data
public class TestReflect {

    static int num = 1;

    private String name;

    static {
        System.out.println("初始化: " + num);
    }


}
