package com.demo.thinking.reflection;

import com.demo.thinking.classes.Student;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/27 02:35
 * @desc 类的初始化
 */
public class InitClassDemo {
//    #### 类的主动引用（一定会发生类的初始化）
//
//当虚拟机启动，先初始化main方法所在的类
//
//new一个类的对象
//
//调用类的静态成员（除了final常量）和静态方法
//
//使用java.lang.reflect包的方法对类进行反射调用
//
//当初始化一个类，如果其父类没有被初始化，则先会初始化他的父类
//
//#### 类的被动引用（不会发生类的初始化）
//
//当访问一个静态域时，只有真正声明这个域的类才会被初始化。如：当通过子类引用父类的静态变量，不会导致子类初始化
//
//通过数组定义类引用，不会触发此类的初始化
//
//引用常量不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("main");

//        new Student();
//        Class.forName("com.demo.thinking.classes.Student");
//        System.out.println(Student.type);

//        System.out.println(Student.head);//只有main、父类加载
//        Student[] students = new Student[3];//只是声明了一个数组，没有新建对象所有只有main类被加载

    }
}
