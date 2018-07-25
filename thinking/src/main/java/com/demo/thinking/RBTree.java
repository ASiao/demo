package com.demo.thinking;

/**
 * @description
 * @auther monicamo
 * @date 2018/7/24
 */
public class RBTree<T extends Comparable<T>> {

	private RBNode<T> mRoot;    // 根结点

	private static final boolean RED   = false;
	private static final boolean BLACK = true;

	public class RBNode<T extends Comparable<T>> {
		boolean color; //颜色
		T key; //关键字(键值)
		RBTree<T> left; //左子节点
		RBTree<T> right; //右子节点
		RBTree<T> parent; //父节点

		public RBNode(T key, boolean color, RBTree<T> parent, RBTree<T> left, RBTree<T> right) {
			this.key = key;
			this.color = color;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}

		public T getKey() {
			return key;
		}

		public String toString() {
			return "" + key + (this.color == RED ? "R" : "B");
		}
	}

}
