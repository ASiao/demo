package com.demo.thinking.classes;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/25
 */
public class Person implements Comparable<Person>{

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
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
}
