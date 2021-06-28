package com.demo.thinking.reflection;

import com.demo.thinking.classes.Person;
import com.demo.thinking.classes.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/28 11:40
 * @desc 有了Class对象，能做什么？
 */
public class ClassFuncDemo {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.demo.thinking.classes.Person");
        //java 9 之后过时
//        Object o = aClass.newInstance();
        //java9之后使用这个
        Person s1 = (Person)aClass.getDeclaredConstructor().newInstance();//调用的无参构造器
        System.out.println(s1);

        Person person = (Person) aClass.getDeclaredConstructor(String.class,Integer.class)
                .newInstance("姓名",22);
        System.out.println(person);

        //通过反射调用方法
        Method setName = aClass.getDeclaredMethod("setName", String.class);
        setName.invoke(s1, "s1Name");
        System.out.println(s1);

        //通过反射操作属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(s1,"s1反射操作属性");
        System.out.println(s1);

    }
}
