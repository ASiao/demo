package com.demo.thinking.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/27 03:00
 * @desc
 */
public class ClassInfoDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.demo.thinking.classes.Student");

        System.out.println(aClass.getName());// 获得包名 + 类名
        System.out.println(aClass.getSimpleName());//获得类名


        //获得类的属性
        System.out.println("========================getFields");
        Field[] fields = aClass.getFields();//只能找到包括父类的public属性
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("========================getDeclaredFields");
        fields = aClass.getDeclaredFields();//找到本类的全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }
        //
        System.out.println("========================getDeclaredField获得指定属性的值");
        Field name = aClass.getDeclaredField("num");
        System.out.println(name);

        //获得类的方法
        System.out.println("======================");
        Method[] methods = aClass.getMethods();//获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的:"+method);
        }
        methods = aClass.getDeclaredMethods();//获得本类的所有方法
        for (Method method : methods) {
            System.out.println("getDeclaredMethods:"+method);
        }

        //获得指定方法
        //重载
        System.out.println("获得指定方法");
        Method getName = aClass.getMethod("getName", null);
        System.out.println(getName);
        Method setName = aClass.getMethod("setName", String.class);
        System.out.println(setName);
        //获得指定的构造器
        System.out.println("======================");
        Constructor[] constructors = aClass.getConstructors();//获得本类public方法
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        constructors = aClass.getDeclaredConstructors();//获得本类所有构造器
        for (Constructor constructor : constructors) {
            System.out.println("#"+constructor);
        }

        //获得指定的构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, Integer.class, Integer.class);
        System.out.println("指定"+declaredConstructor);


    }
}
