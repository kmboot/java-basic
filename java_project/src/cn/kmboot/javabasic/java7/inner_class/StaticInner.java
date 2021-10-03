package cn.kmboot.javabasic.java7.inner_class;

public class StaticInner {
	static int outterInt = 10;
	//静态内类
	static class Nest {
		void go(String msg) {
			//可以访问外部类的静态变量
			outterInt ++;
			System.out.println("hi,"+msg);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticInner.Nest n = new StaticInner.Nest();   // both class names
	    n.go("你好!");
	    Nest b2 = new Nest();     // access the enclosed class
	    b2.go("新年好!");
	}

}
