package com.demo.thinking.lambda;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/10 20:47
 * @desc lambda表达式只能有一行代码的情况下才能简化成一行，如果有多行，那么就用代码块包裹。就是花括号包裹
 *  前提是接口为函数式接口
 *  多个参数也可以去掉参数类型，要去掉就都去掉，必须把多个参数括在括号里面
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        ILove love = (a)-> {System.out.println("I love "+a);};
        love.love(2);
    }
}

interface ILove {
    void love(int a) ;
}

class Love implements ILove{

    @Override
    public void love(int a) {
        System.out.println("I LOVE "+a);
    }
}
