package com.demo.thinking.container;

import java.util.PriorityQueue;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/26
 */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		q1.add(2);
		q1.add(5);
		q1.add(7);
		q1.add(1);
		while (!q1.isEmpty()){
			System.out.print(q1.poll()+" ");
		}
	}
}
