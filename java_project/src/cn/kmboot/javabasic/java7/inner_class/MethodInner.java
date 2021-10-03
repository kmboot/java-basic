package cn.kmboot.javabasic.java7.inner_class;

public class MethodInner {
	
	public static void main(String[] args) {
		MethodInner.doStuff();
	}
	
	private static String x = "Outer2";
	//静态方法
	static void doStuff() {
		//方法内部类
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
			} 
		}
		//方法内部类,只能在方法内部实例化,调用
		MyInner mi = new MyInner(); 
		mi.seeOuter();
		
	}
}