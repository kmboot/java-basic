package cn.kmboot.javabasic.java2.object_oriented;

import cn.kmboot.javabasic.java1.declare.Apple;

public class BigRedApple extends Apple {

	private static final long serialVersionUID = 1L;

	public BigRedApple(){
		System.out.print("BigRedApple,构造函数");
	}
	
	public BigRedApple(String color){
		//访问父类方法.
		//super()
		super.setColor(color);
		System.out.print("BigRedApple,构造函数3");
	}
	
	/**
	 * overriding,重写方法<br>
	 * 异常声明无法扩大,只能缩小<br>
	 * 访问修饰符号,无法修改<br>
	 * 参数列表,必须相同(这里是空的)<br>
	 * 返回类型,无法修改
	 */
	@Override
	public void bloomFlower() {

	}
	
	/**
	 * overloading,重载方法<br>
	 * 异常声明可以扩大<br>
	 * 访问修饰符号,可以修改<br>
	 * 参数列表,必须不同<br>
	 * 返回类型,可以修改
	 * 
	 * 
	 * @param color
	 * @throws Exception
	 */
	protected boolean bloomFlower(String color)throws Exception {
		return false;
	}
}
