package com.ljq.study.test.flatMap;

import com.ljq.study.test.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijq
 * @date 2020/10/16 17:09
 * @desc .
 **/
public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list.addAll(list1);

//     List<List<Integer>> listList = new ArrayList<>();
//
//     listList.add(list1);
//     listList.add(list);
//
//        List<Integer> collect = listList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(list);


List<Student> studentList =new ArrayList<>();

studentList.add(new Student(1,"x"));

   studentList.stream().peek(student -> student.setName("试试水"));

        System.out.println(studentList);


    }
}
