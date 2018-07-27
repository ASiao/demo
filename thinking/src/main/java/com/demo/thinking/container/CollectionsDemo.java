package com.demo.thinking.container;

import java.util.*;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/27
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		//Arrays.asList 固定大小的数组转换成List，底层是数组，不能调整其大小
		List<Snow> snow1 = Arrays.asList(new Powder(),new S2());
		List<Snow> snow2 = Arrays.asList(new P2(),new P1());
		List<Snow> snow3 = new ArrayList<>();
		snow3.add(new Snow());
		//固定尺寸的List中添加元素，报异常UnsupportedOperationException
		//Collections.addAll(snow1,new P2(),new P1());

		Collections.addAll(snow3,new P2(),new P1());


	}
}

class Snow{}
class Powder extends Snow{}
class P1 extends Powder{}
class S2 extends Snow{}
class P2 extends Powder{}

