package com.demo.thinking.classes;

import java.util.Objects;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/25
 */
public class Person implements Comparable<Person>{

	private String name;
	private Integer age;
	public static String head = "头";

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	static {
		System.out.println("父类Person");
	}

	public Person(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public int compareTo(Person o) {
		if (o.getAge()>this.getAge()) {
			return -1;
		}else if (o.getAge()<this.getAge()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(age, person.age);
	}

	@Override
	public int hashCode() {

		return Objects.hash(age);
	}

	public Person() {
	}
}
