package com.demo.thinking.anno;

import java.lang.annotation.*;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/26 14:38
 * @desc  元注解
 */
//表示注解可以用在什么地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//表示注解在什么地方还有效果  runtime >class> source
@Retention(value = RetentionPolicy.RUNTIME)
//表示是否将我们的注解生成在java doc中
@Documented
//子类可以继承父类的注解
@Inherited
public @interface MyAnno {

    String name() default "";
    int age() default 0;
    String[] schools();
}

class Test {

    @MyAnno(name = "qq",schools = {"a","b"})
    public void test() {

    }
}
