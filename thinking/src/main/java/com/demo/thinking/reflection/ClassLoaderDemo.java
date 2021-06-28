package com.demo.thinking.reflection;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/27 02:02
 * @desc
 */
public class ClassLoaderDemo {

    public static void main(String[] args) throws ClassNotFoundException {
//获取系统类的加载器 AppClassLoader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获得系统类加载器的父类加载器-->扩展了加载器 PlatformClassLoader
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器的父类加载器-->根加载器（c/c++）
        ClassLoader parent1 = parent.getParent();
        //引导类加载器：用c++编写的，是JVM自带的类加载器，负责Java平台核心库，用来装载核心类库。该加载器无法直接获取 输出为null
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的-----系统类的加载器AppClassLoader
        ClassLoader classLoader = Class.forName("com.demo.thinking.reflection.ClassLoaderDemo").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的----引导类加载  输出为null
        classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);

        //获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
