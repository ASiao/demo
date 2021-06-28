package com.demo.thinking.classes;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/27
 */
public class Student extends Person {

	private Integer num;
	public static String type = "学生" ;

	public Student(String name, Integer age, Integer num) {
		super(name, age);
		this.num = num;
	}

	static  {
		System.out.println("子类strudent");
	}

	public Student(Integer age, Integer num) {
		super(age);
		this.num = num;
	}

	private Student(Integer age) {
		super(age);
	}


	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student{" +
				"num=" + num +
				'}';
	}
}
