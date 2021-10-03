package cn.kmboot.javabasic.java1.declare;

/**
 * 类的声明,
 * 
 */
public class Apple extends Fruit {

	private static final long serialVersionUID = 1L;
	// JavaBeans属性
	private String color;// 颜色
	private boolean eatable;// 是否可食用

	public Apple(){
		super();
		System.out.println("Apple,构造函数2");
	}
	
	public Apple(String color){
		this.setColor(color);
	}
	
	@Override
	public int growStrong(int rate) {
		System.out.println("***growStrong方法被调用,苹果树生长了"+rate+"个点");
		return 0;
	}

	@Override
	public void bloomFlower() {
		System.out.println("***bloomFlower方法被调用,开了一朵小小的苹果花");
	}

	@Override
	public void abstractMethod() {

	}

	// getter & setter, for JavaBeans
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEatable() {
		return eatable;
	}

	public void setEatable(boolean eatable) {
		this.eatable = eatable;
	}
}

/**
 * 可以存在default修饰符的class声明<br>
 * MiniApple不是public修饰符
 */
abstract class MiniApple extends Apple {
	private static final long serialVersionUID = 1L;

	//构造器1
	public MiniApple(){
		
	}
	//构造器2
	public MiniApple(String color){
		this.setColor(color);
	}
	// final,最终方法
	public final String description(final String arg1) {
		return "";
	}

	// synchronized,同步方法
	public synchronized void pickedBy(String owner) {
		//
	}

	// static,静态方法,不用实例化调用
	public static void statciMethod() {
	}

	// abstract,抽象方法
	public abstract void abstractMethod();

	// native,本地方法,调用C语言写的本地库(不详细解释)
	private native void nativeMethod();

	// transient,瞬间变量,不会被序列化
	transient String owner;
	// volatile,挥发变量,寄存器变量(无法保证线程安全)
	volatile int weight;
	// static,静态数组
	static int[] RGBcolor;
}
