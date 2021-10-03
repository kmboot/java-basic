package cn.kmboot.javabasic.java1.declare;

public class Main {

	public static void main(String[] args) {
		//声明局部变量(引用类型,堆上)
		Apple apple = new Apple();
		apple.setColor("red");
		apple.growStrong(10);
		apple.bloomFlower();
		//声明局部变量(原始类型,栈上)
		int i = 99;
		System.out.println(i);
		
	}

}
