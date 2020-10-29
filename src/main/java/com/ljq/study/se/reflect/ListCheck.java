package com.ljq.study.se.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lijq
 * @date 2020/9/7 11:57
 * @desc list越过泛型检查
 **/
public class ListCheck {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        Class<? extends List> clazz = list.getClass();

        Method method = clazz.getMethod("add", Object.class);

        method.invoke(list, "小李");

        System.out.println(list);
    }

}
