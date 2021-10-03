package cn.kmboot.javabasic.java1.declare;

/**
 * 抽象类,允许有抽象方法,不必实现接口的方法
 *
 */
public abstract class Fruit implements IPlant {

	private static final long serialVersionUID = 1L;
	
	public Fruit(){
		System.out.println("Fruit,构造函数1");
	}
	//抽象类,允许有抽象方法
	public abstract void abstractMethod();

}
