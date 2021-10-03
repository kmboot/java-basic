package cn.kmboot.javabasic.java3.assignments;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 10, k = 10, val = 0;
		val = i++;
		System.out.println("i的值" + val);
		val = ++k;
		System.out.println("k的值" + val);
		//
		i += 1;
		System.out.println("i的值" + i);
		//三目运算
		String test = (i > 0) ? "大于零" : "小于零";
		System.out.println("i的值:" + test);
		
		int j = 5;
		//短路操作符号,最少计算量
		//将(3>2)改完(3>5),查看j的值
		if (test instanceof String && (3>2) && (j++>0)) {
			System.out.println("test是String类型");
		}
		System.out.println("j="+j);

		//
		char c = 'b';
		double d = 9989.98867;
		// 自动转换:原始值与封装类型
		Integer ii = i;
		byte b = 9;
	    short s = 9;
	    long l = 9;
	    float f = 9.0f;
	    go(b);
	    go(s);
	    go(l);
	    go(f);//浮点类型,自动转换为double
	    
	    //引用传值 & 原始传值
	    System.out.println("");
	    i = 5;
	    Main.passArg(i);
	    //原始传值,会有一个拷贝,这个i不会被修改
	    System.out.println("i是原始传值:"+i);
	    StringBuffer ref = new StringBuffer("5");
	    Main.passArg1(ref);
	    //引用是指针，保存了对象在内存中的地址,不同引用可以指向同一个对象
	    System.out.println("ii是引用传值:"+ref);
	}

	static void go(int x) {
		System.out.print("int ");
	}

	static void go(long x) {
		System.out.print("long ");
	}

	static void go(double x) {
		System.out.print("double ");
	}
	
	static void passArg(int x){
		x = 999;
	}
	
	static void passArg1(StringBuffer x){
		x.append("-追加值");
	}

}
