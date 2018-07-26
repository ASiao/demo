package com.demo.thinking.container;

import com.demo.thinking.classes.Animal;
import com.demo.thinking.classes.Person;

import java.util.HashMap;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/26
 */
public class HashMapDemo {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put(new Person(33),"33人");
		map.put(new Person(22),"22人");
		map.put(new Person(36),"36人");
		map.put(new Person(38),"38人");
		map.put(new Person(100),new Animal(106));

		System.out.println(map.containsKey(new Person(22)));
		System.out.println(map.containsKey(new Person("Tony",22)));
		System.out.println(map.containsValue(new Animal(106)));
		System.out.println(map.containsValue(new Person(106)));
		System.out.println(map.containsValue(new Animal("dog",106)));
		System.out.println(map.containsValue(new Animal(10)));


	}

}
