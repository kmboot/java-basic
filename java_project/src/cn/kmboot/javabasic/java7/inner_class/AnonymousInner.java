package cn.kmboot.javabasic.java7.inner_class;

public class AnonymousInner {

	public static void main(String[] args) {

		// 普通匿名内类1,重写方法pop
		OldNested p = new OldNested() {
			@Override
			public void pop() {
				System.out.println("普通匿名内类1,重写方法");
			}
		};
		p.pop();

		// 普通匿名内类2,实现接口Cookable,实现方法cook()
		Cookable c = new Cookable() {
			@Override
			public void cook() {
				System.out.println("普通匿名内类2,直接实现接口");
			}
		};
		c.cook();

		// 参数匿名内类
		new Chef().doStuff(new Cookable() {
			@Override
			public void cook() {
				System.out.println("参数匿名内类,参数内直接实现接口");
			}
		});

	}

}

// old-Pain#1,
class OldNested {
	public void pop() {
		System.out.println("popcorn");
	}
}

// old-Pain#2,
interface Cookable {
	public void cook();
}

// Argument-defined anonymous nested classes
class Chef {
	public void doStuff(Cookable food) {
		// 调用接口方法
		food.cook();
	}
}