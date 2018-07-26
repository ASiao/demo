package com.demo.thinking.enums;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/25
 */
public class EnumDemo {
	public static void main(String[] args) {
		for (Weekday w:Weekday.values()) {
			System.out.println("枚举次序:"+w.ordinal());
			System.out.println("compareTo(Weekday.Wednesday)"+w.compareTo(Weekday.WEDNESDAY));
			System.out.println(w.equals(Weekday.THURSDAY));
			System.out.println(w==Weekday.THURSDAY);
			System.out.println("所属类："+w.getDeclaringClass());
			System.out.println("返回声明名字，同toString"+w.name());
			System.out.println("----------");
		}

		for (String s:"WEDNESDAY FRIDAY".split(" ")) {
			//valueOf是Enum的static方法，根据给定名字返回对应enum实例，若不存在抛出异常：java.lang.IllegalArgumentException: No enum constant com.demo.thinking.enums.Weekday.dd
			Weekday weekday = Enum.valueOf(Weekday.class,s);
			System.out.println(weekday);
		}
	}
}
