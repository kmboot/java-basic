package cn.kmboot.javabasic.java7.inner_class;

/**
 * 普通内类<br>
 * 内类编译,会生成两个文件<br>
 * CommonInner.class<br>
 * CommonInner$Inner.class<br>
 * 
 * @author laiqinyi
 *
 */
public class CommonInner {
	//
	private class Inner{
		public void haveFun(){
			System.out.println("InnerClass.haveFun()");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//先实例化外部类
		CommonInner outer = new CommonInner();
		CommonInner.Inner inner = outer.new Inner();
		inner.haveFun();
	}

}
