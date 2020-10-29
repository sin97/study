package com.ljq.study.se.reflect;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {

        /**
         *  1.   .class不会自动初始化该对象
         *  2.   class.forName会自动初始化
         */

        Class<TestReflect> clazz = TestReflect.class;

        System.out.println("===============");

        Class<?> aClass = Class.forName("com.ljq.study.se.reflect.TestReflect");

        TestReflect testReflect = (TestReflect) aClass.newInstance();

        //获得name属性字段
        Field name = clazz.getDeclaredField("name");
        //暴力反射，修改访问权限,可以用在 private 的 filed,method,constructor
        name.setAccessible(true);
        name.set(testReflect, "李哥");

        System.out.println(testReflect);

    }
}