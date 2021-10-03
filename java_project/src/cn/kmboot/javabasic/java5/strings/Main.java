package cn.kmboot.javabasic.java5.strings;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 关于equal与hashCode方法
		Main.aboutEqual();
		// 关于toString方法
		Main.aboutToString();
		// 关于String
		Main.aboutString();
		//关于StringBuffer
		Main.aboutStringBuffer();
		//关于Math类
		Main.aboutMath();

	}

	/**
	 * 重新equal与hashCode,对象才能比较,用于散列值,搜索<br>
	 * 
	 */
	public static void aboutEqual() {
		User m1 = new User();
		m1.setAge(23);
		m1.setName("tom");
		User m2 = new User();
		m2.setAge(23);
		m2.setName("tom");
		if (m1.equals(m2)) {
			System.out.println("m1 is same with m2");
		} else {
			System.out.println("there are some difference between m1 and m2");
		}
	}

	public static void aboutToString() {
		User user = new User();
		user.setAge(30);
		user.setName("Norman");
		// 自动调用User.toString方法;
		System.out.println(user);
	}

	/**
	 * 每次操作,产生新的String对象,旧的String对象都被废弃<br>
	 * JVM存在一个String池,重复利用String对象
	 */
	public static void aboutString() {
		// String不变性,
		String x = "Java";
		//废弃
		x.concat(" addtional");
		x.replace('a', 'x');
		System.out.println("x = " + x); // the output is: x = Java
		//重新赋值给x
		x = x.replace('a', 'x');
		System.out.println("x = " + x); // the output is: x = Jxvx
	}
	
	/**
	 * StringBuffer为线程安全,StringBuild线程不安全<br>
	 * 组装内容,for循环内操作String的时候,请使用StringBuffer代替
	 */
	public static void aboutStringBuffer(){
		StringBuffer buffer = new StringBuffer();
		StringBuilder build = new StringBuilder();
		buffer.append("<?xml version=\"1.0\"?>");
		buffer.append("<note>");
		buffer.append("content of this node.");
		buffer.append("</note>");
		System.out.println(buffer.toString());
	}
	
	/**
	 * 常用的Math方法
	 */
	public static void aboutMath(){
		//绝对值
		System.out.println("abs = "+Math.abs(-12.4));
		//进一法
		System.out.println("ceil = "+Math.ceil(12.4));
		//去尾法
		System.out.println("floor = "+Math.floor(12.4));
		//四舍五入
		System.out.println("round = "+Math.round(12.5));
		//随机函数
		System.out.println("random = "+Math.random());
	}

}
