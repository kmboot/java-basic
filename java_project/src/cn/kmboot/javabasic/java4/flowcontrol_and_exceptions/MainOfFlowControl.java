package cn.kmboot.javabasic.java4.flowcontrol_and_exceptions;

public class MainOfFlowControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// if
		//1,注意if条件里面有多个条件,需要括号
		//2,注意大括号{},即使只有一条语句也使用大括号
		if((3>0) && (9*1<0) || (0<=0)){
			System.out.println("if语句");
		}
		
		// switch,
		// 1,注意break自动掉落
		// 2,default可以放在中间
		int x = 2;
		switch (x) {
		case 2:
			System.out.println("x is equal to 2");
			// break;
		default:
			System.out.println("默认值条件,可以放在中间");
		case 3:
			System.out.println("x is equal to 3");
			// break;
			// default: System.out.println("Still no idea what x is");
		}

		// while,
		// 1, 注意do-while,总是会运行一次,即使条件是false
		x = 2;
		while (x == 2) {
			System.out.println(x);
			++x;
		}
		do {
			System.out.println("Inside loop");
		} while (false);

		// for
		//1,注意break,continue区别
		//2,注意label使用
		Label1: for (int i = 0; i < 10; i++) {
			System.out.print(", i=" + i);
			Lable2: for(int k=0;k<3;k++){
				if(k>1){
					break Label1;
				}
			}

		}
		
		//增强for循环
		int[] list = {3,6,9,11};
		for(int num : list){
			System.out.println("增强for循环:"+num);
		}
		
		//END_OF_ALL

	}

}
