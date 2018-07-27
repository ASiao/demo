package com.demo.thinking.container;

import com.demo.thinking.classes.Animal;
import com.demo.thinking.classes.Person;
import com.demo.thinking.classes.Student;

import java.util.*;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/27
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList persons = new ArrayList();
		for (int i = 0; i < 3; i++) {
			persons.add(new Person(i));
		}

		/*//强制转型时报错
		persons.add(new Animal(0));*/
		for (int i = 0; i <persons.size() ; i++) {
			System.out.println(((Person)persons.get(i)).getAge());
		}

		//向上转型，不需要用到ArrayList的自带方法
		//能通过接口很大限度上规范开发人员的实现规则，因为你现在只能调用接口的方法。
	/*	我需要一个实现了List接口的实现类对象。
		具体是哪种实现，我们并不关心。
		因为List接口中定义的方法足够我们使用。
		这时，这种定义方式，就会发生向上转型。
		由具体类型向上转为通用的接口类型。
		但是，伴随向上转型时会发生信息丢失，也就是说，
		你拿到的这个对象中仅仅只能访问到List接口中定义的成员方法，
		而具体实现类新增的扩展方法将会丢失。*/
		List<Person> people = new ArrayList<>();
		people.add(new Person(4));
		System.out.println("ArraryList"+people.get(0));
		//可插入空值
		people.add(null);
		System.out.println(people);




	}
}

