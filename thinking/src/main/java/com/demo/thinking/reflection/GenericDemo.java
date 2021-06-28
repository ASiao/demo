package com.demo.thinking.reflection;

import com.demo.thinking.classes.Person;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author prprpr
 * @version 1.0
 * @date 2021/6/28 12:29
 * @desc 反射操作泛型
 */
public class GenericDemo {

    public void test01(Map<String, Person> map, List<Person> list){
        System.out.println("test01");
 
    }
    public Map<String ,Person>test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws Exception{
        Method test01 = GenericDemo.class.getDeclaredMethod("test01", Map.class, List.class);
        //getGenericParameterTypes获得泛型的参数类型
        Type[] genericParameterTypes = test01.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("#泛型" + genericParameterType);
            if (genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("泛型中的真实数据类型"+actualTypeArgument);
 
                }
            }
        }

        Method test02 = GenericDemo.class.getDeclaredMethod("test02");
        Type genericReturnType = test02.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("真实返回的泛型中参数类型"+actualTypeArgument);
            }
        }

    }
}
