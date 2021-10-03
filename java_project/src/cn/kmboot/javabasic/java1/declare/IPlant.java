package cn.kmboot.javabasic.java1.declare;

import java.io.Serializable;

/**
 * 接口命名,第一个字符必须大写,后面是驼峰命名<br>
 * public的接口,必须和文件名称一致<br>
 * @author laiqinyi
 *
 */
public interface IPlant extends Serializable {
	
	//常量命名,全部使用大写字符,下划线连接
	public static final String TYPE_NAME = "水果";
	//所有接口声明的成员变量都是public static final
	String CATEGORY_NAME = "植物";
	
	//方法命名,第一个字符必须小写,后面是驼峰命名<br>
	public abstract int growStrong(int rate);
	//所有方法声明的都是public abstract
	void bloomFlower();
	
}
