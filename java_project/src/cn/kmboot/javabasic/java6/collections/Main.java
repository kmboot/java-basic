package cn.kmboot.javabasic.java6.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ordered排序[比较大小],Sorted分类[a-z自然顺序]
		Main.aboutMap();
		Main.aboutSet();
		Main.aboutList();
	}

	public static void aboutMap(){
		//泛型,本质是指定[参数的类型]
		//HashMap为线程
		HashMap<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("key1",	"apple");
		hashMap.put("key2",	"orange");
		hashMap.put("key1",	"999");//key值相同,会被覆盖.
		hashMap.remove("key2");//删除key2
		//增强for循环
		for(String key: hashMap.keySet()){
			System.out.println("map.key="+key+", map.val="+hashMap.get(key));
		}
		
		//Hashtable,线程同步,属于早期遗留
		Hashtable<String,String> table = new Hashtable<String,String>();
		table.put("t1", "pen");
		table.put("t2", "paper");
		
	}
	
	public static void aboutSet(){
		//Set,存储[唯一值],值不会重复
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("apple");
		hashSet.add("banana");
		for(String key : hashSet){
			System.out.println("set.key="+key);
		}
		
		//TreeSet,默认:自然顺序排列a-z,可以自定义规则
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("z");
		treeSet.add("d");
		treeSet.add("a");
		for(String key : treeSet){
			System.out.println("treeSet.key="+key);//result=a,d,z
		}


	}
	
	public static void aboutList(){
		//List,链表,值可以重复,关心索引,排序
		ArrayList<String> list = new ArrayList<String>();
		list.add("water");
		list.add("cake");
		list.add("egg");
		list.remove("cake");
		for(String item : list){
			System.out.println("list.item="+item);
		}
		int index = list.indexOf("egg");
		System.out.println("list.indexOf('egg') = "+ index);
		
		//Vector,方法同步,线程安全.基本与ArrayList相同,属于早期遗留
		Vector<String> vector = new Vector<String>();
		vector.add("a");
		vector.add("b");
		
		//LinkedList,插入删除更加快速,但是历遍比ArrayList慢
		LinkedList<String> lklist = new LinkedList<String>();
		lklist.add("a");
		lklist.add("b");

	}
	
	
}
