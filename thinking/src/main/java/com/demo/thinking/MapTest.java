package com.demo.thinking;

import com.demo.thinking.classes.Person;

import java.util.*;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/23
 */
public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(8, "wangwu");
		map.put(2, "lisi");
		map.put(7, "zhangsan");
		map.put(6, "xuliu");


		System.out.println(map);
		map.put(3,"ppp");
		for (Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}




		TreeSet<Person> personTree = new TreeSet<>();
		personTree.add(new Person(11));
		personTree.add(new Person(22));
		personTree.add(new Person("name22",22));
		personTree.add(new Person(21));
		personTree.add(new Person(2));

		System.out.println(personTree);


	}
}
