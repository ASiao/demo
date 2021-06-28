package com.demo.thinking.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/28 12:37
 * @desc
 */
public class AnnoDemo {

    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.demo.thinking.reflection.User");
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        //获得类的注解的值
        MyTable myTable = aClass.getAnnotation(MyTable.class);
        System.out.println(myTable.value());

        //获得类的成员指定的注解
        Field name = aClass.getDeclaredField("name");
        MyField myField = name.getAnnotation(MyField.class);
        System.out.println(myField.columnName());
        System.out.println(myField.length());
        System.out.println(myField.type());
    }
}

@MyTable("db_user")
class User {

    @MyField( columnName = "Fid",type = "int",length = 10)
    private int id;
    @MyField(columnName = "Fage",type = "int",length = 10)
    private int age;
    @MyField(columnName = "Fname",type = "varchar",length = 3)
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyTable {
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyField {
    String columnName();
    String type();
    int length();
}
