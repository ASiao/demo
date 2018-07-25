package com.demo.thinking.container;

import com.demo.thinking.classes.NormalPerson;
import com.demo.thinking.classes.Person;

import javax.jnlp.PersistenceService;
import java.util.TreeSet;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/25
 */
public class TreeSetDemo {
	//非线性安全
	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<>();
		tree.add("哈哈哈");
		tree.add("中文");
		tree.add("a");
		tree.add("abc");
		tree.add("aa");
		tree.add("b");

		System.out.println(tree);
		System.out.println(tree.comparator());
		System.out.println(tree.subSet("aa","b"));

		System.out.println("哈哈".compareTo("中文"));

		System.out.println("-------");
		TreeSet<Person> personTree = new TreeSet<>();
		Person p1=new Person(11);
		Person p2 = new Person(22);
		Person p3 = new Person(44);
		Person p4 = new Person("same",44);
		personTree.add(p1);
		personTree.add(p2);
		personTree.add(p3);
		//根据年龄比较，p3和p4相同，故p4没有put进去
		personTree.add(p4);

		System.out.println(personTree);

		//修改对象后不会对已形成的排序造成影响，不建议修改放入TreeSet集合中的元素的关键示例变量
		p1.setAge(55);
		System.out.println(personTree);

		p3.setAge(22);
		System.out.println(personTree);

/*	TreeSet<NormalPerson> normalTree = new TreeSet<>();
		NormalPerson n1=new NormalPerson(11);
		NormalPerson n2 = new NormalPerson(22);
		NormalPerson n3 = new NormalPerson(44);
		NormalPerson n4 = new NormalPerson("same",44);
		//无法进行比较，报异常 Exception in thread "main" java.lang.ClassCastException: com.demo.thinking.classes.NormalPerson cannot be cast to java.lang.Comparable
		normalTree.add(n1);
		normalTree.add(n2);
		normalTree.add(n3);
		normalTree.add(n4);

		System.out.println(normalTree);*/
	}
}
