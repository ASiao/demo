package com.demo.thinking.lambda;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/10 17:30
 * @desc 避免匿名内部类定义过多
 *
 * 可以让代码看起来很简洁
 *
 * 去掉了一堆没有意义的代码，只留下核心的逻辑
 *
 * 其实质属于函数式编程的概念
 *
 *  (params)->expression[表达式]
 *      (params)->statement[语句]
 *      (params)->{statements}
 *
 *      函数式接口的定义：任何接口，如果只包含唯一一个抽象方法，那么它就是一个函数式接口。
 */
public class LambdaTest {

    //静态内部类
    static class Like2 implements ILike{
        @Override
        public void lambda(){
            System.out.println("静态内部类实现接口");
        }
    }

    public static void main(String[] args) {
        //法一：创建对象调用方法
        ILike like = new Like();
        like.lambda();

        //法二：使用静态内部类
        like = new Like2();
        like.lambda();

        //法三 局部内部类
        class Like3 implements ILike{
            @Override
            public void lambda(){
                System.out.println("局部内部类实现接口");
            }
        }
        like = new Like3();
        like.lambda();

        //法四 匿名内部类
        like = new ILike(){
            @Override
            public void lambda() {
                System.out.println("匿名内部类实现接口");
            }
        };
        like.lambda();

        //lambda简化
        like = ()-> System.out.println("lambda表达式实现接口");
        like.lambda();

    }
}
