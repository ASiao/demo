package com.demo.thinking.reflection;

import com.demo.thinking.classes.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/28 12:13
 * @desc 分析 setAccessible 性能
 */
public class AccessibleDemo {

    private final static int num = 1000000000;

    public static void main(String[] args) throws Exception{
//        普通方法执行10亿次:5ms
//        反射方法执行10亿次:2311ms
//        反射方法关闭安全检测执行10亿次:1067ms
        normal();
        reflect();
        reflectAccessible();
    }

    public static void normal() {
        Person person = new Person();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            person.getName();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("普通方法执行10亿次:" + (endTime - startTime) + "ms");

    }

    public static void reflect() throws Exception {
        Class<?> aClass = Class.forName("com.demo.thinking.classes.Person");
        Person person = (Person) aClass.getDeclaredConstructor().newInstance();
        Method getName = aClass.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            getName.invoke(person, null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("反射方法执行10亿次:" + (endTime - startTime) + "ms");

    }

    public static void reflectAccessible() throws Exception {
        Class<?> aClass = Class.forName("com.demo.thinking.classes.Person");
        Person person = (Person) aClass.getDeclaredConstructor().newInstance();
        Method getName = aClass.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            getName.invoke(person, null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("反射方法关闭安全检测执行10亿次:" + (endTime - startTime) + "ms");

    }

}
