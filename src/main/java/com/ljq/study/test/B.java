package com.ljq.study.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijq
 * @date 2020/10/20 14:18
 * @desc
 **/
public class B {
    public static void main(String[] args) {

        List<Student> studentList = studentList();

        System.out.println(studentList);
        Student student = student();

        System.out.println(studentList.contains(student));

        studentList.remove(student);
        System.out.println(studentList);


    }

    private  static List<Student> studentList (){
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "小李");
        Student s2= new Student(2, "小王");
        Student s3= new Student(3, "小黑");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        return studentList;

    }

    private static Student student(){
       return   new Student(2, "小王");
    }
}
