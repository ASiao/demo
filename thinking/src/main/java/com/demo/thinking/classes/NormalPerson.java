package com.demo.thinking.classes;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/25
 */
public class NormalPerson {

	private String name;
	private Integer age;

	public NormalPerson(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public NormalPerson(Integer age) {
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
	public String toString() {
		return "NormalPerson{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
