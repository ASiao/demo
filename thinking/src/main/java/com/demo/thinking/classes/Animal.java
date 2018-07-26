package com.demo.thinking.classes;

import java.util.Objects;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/26
 */
public class Animal {

	private String name;

	private Integer age;

	public Animal(Integer age) {
		this.age = age;
	}

	public Animal(String name, Integer age) {
		this.name = name;
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
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o;
		return Objects.equals(age, animal.age);
	}

	@Override
	public int hashCode() {

		return Objects.hash(age);
	}
}
