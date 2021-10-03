package cn.kmboot.javabasic.java8.threads;

public class MyThread {

	public static void main(String[] args) {
		//线程1
		Task task = new Task();
		Thread one = new Thread(task);// New-state
		System.out.println("New-state");
		one.setName("任务1");
		one.start();// Runnable-state
		System.out.println("Runnable-state");
		//线程2,使用匿名嵌套类
		Thread two = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("##任务2=="+i);		
					try {
						// 线程休眠1秒钟
						Thread.sleep(500);
					} catch (InterruptedException ex) {
					}
				}
			}
			
		});
		two.start();

	}

}

class Task implements Runnable {
	@Override
	public void run() {
		for (int x = 1; x < 4; x++) {
			System.out.println("Runing-state: "
					+ Thread.currentThread().getName());
			try {
				// 线程休眠1秒钟
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
		}
	}

}
