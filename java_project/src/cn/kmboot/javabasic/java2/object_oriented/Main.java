package cn.kmboot.javabasic.java2.object_oriented;

import cn.kmboot.javabasic.java1.declare.Apple;
import cn.kmboot.javabasic.java1.declare.Fruit;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//注意构造函数,调用链接
		Fruit apple1 = new BigRedApple();
		apple1.growStrong(10);
		apple1.bloomFlower();
		
		//父类,类型相容
		Apple apple2 = new BigRedApple();
		apple2.growStrong(20);
		apple2.bloomFlower();

	}

}
