package com.ljq.study.test;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author lijq
 * @date 2020/10/22 17:35
 **/
public class C {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.with(DayOfWeek.MONDAY));
        System.out.println(now.with(DayOfWeek.SUNDAY));
    }
}
