package com.demo.thinking.reflection;

import com.demo.thinking.classes.Person;
import com.demo.thinking.classes.Student;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/26 15:57
 * @desc  获取class   一个类反射得到的class唯一
 */
public class Reflect1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //方法一  forName 获取
        Class<?> aClass = Class.forName("com.demo.thinking.classes.Student");
        System.out.println(aClass.hashCode());

        //方法二  通过实例对象获取
        Person person = new Student(11,22);
        Class<? extends Person> aClass1 = person.getClass();
        System.out.println(aClass1.hashCode());

        //方式三 通过 类名.class 获取
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.hashCode());

        //方式四：针对基本内置类型的包装类，都有一个Type属性
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        //获得父类类型
        Class<?> superclass = aClass1.getSuperclass();
        System.out.println(superclass);

    }
}
