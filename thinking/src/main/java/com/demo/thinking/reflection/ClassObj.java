package com.demo.thinking.reflection;

import com.demo.thinking.enums.Weekday;
import com.demo.thinking.lambda.ILike;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/26 16:21
 * @desc 有Class对象的类型
 */
public class ClassObj {

    public static void main(String[] args) {
        //类
        Class<Object> objectClass = Object.class;
        //接口
        Class<ILike> iLikeClass = ILike.class;
        //一维数组
        Class<String[]> aClass = String[].class;
//        二维数组
        Class<int[][]> aClass1 = int[][].class;
        //注解
        Class<Override> overrideClass = Override.class;
        //基本数据类型
        Class<Boolean> booleanClass = Boolean.class;
        //枚举
        Class<Weekday> weekdayClass = Weekday.class;
        //void
        Class<Void> voidClass = void.class;
        //class
        Class<Class> classClass = Class.class;


        System.out.println(objectClass);
        System.out.println(iLikeClass);
        System.out.println(aClass);
        System.out.println(aClass1);
        System.out.println(overrideClass);
        System.out.println(booleanClass);
        System.out.println(weekdayClass);
        System.out.println(voidClass);
        System.out.println(classClass);

//        只要元素类型与维度一样，就是同一个Class,哈希值就是一样的
        int[] a = new int[10];
        int[] b = new int[100];

        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }
}
