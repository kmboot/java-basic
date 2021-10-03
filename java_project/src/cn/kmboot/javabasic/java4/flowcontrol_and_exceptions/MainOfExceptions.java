package cn.kmboot.javabasic.java4.flowcontrol_and_exceptions;

public class MainOfExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		
		try {
			//
			int result = MainOfExceptions.test();
			System.out.println("result = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 异常匹配层次:符合异常类的继承层次<br>
	 * ArithmeticException为Exception的子类
	 * @throws Exception 方法声明异常
	 */
	public static int test() throws Exception{
		int i = 0;
		try {
			i = 100/0;
			throw new Error("抛出新的异常");
		} catch (ArithmeticException ex1) {
			ex1.printStackTrace();
			return 0;
		}catch(RuntimeException ex2){
			//pass
		}catch(Exception ex3){
			//重新抛出异常
			throw ex3;
		}finally{
			return 9;
		}
	}

}
