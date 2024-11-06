package com.shpn.debuglearn;

import com.shpn.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class MainDebug {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        learnDebug();
    }

    public static void learnDebug() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(01, "张三", 20));
        studentList.add(new Student(02, "李四", 22));
        studentList.add(new Student(02, "赵武", 23));
        //稍后用来模拟空指针
        studentList.add(new Student(02, "老六", 20));
        studentList.add(new Student(02, "王七", 20));
        studentList.add(new Student(02, "猪八", 22));

        studentList.forEach(student -> {
            String name = student.getName();
            if("老六".equals(name)){
                System.out.println("我是老六");
            }
            //稍后用来模拟空指针
            int age = student.getAge() + 10;
            System.out.println("十年后我是：" + age + "岁——》" + name);
        });
    }
}
