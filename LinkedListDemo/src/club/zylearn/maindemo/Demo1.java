package club.zylearn.maindemo;

import club.zylearn.utils.LinkedList;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("java");
		linkedList.add("jsp");
		linkedList.add("html/css");
		linkedList.add("mybatis");
		linkedList.add("软件工程");
		System.out.println(linkedList.size());
		System.out.println(linkedList.get(4));
		
		System.out.println(linkedList.contains("mmm"));
		linkedList.add("mmm");
		Object[] dataArray = linkedList.toArray();
		for(Object data : dataArray) {
			System.out.print(data + "\t");
		}
		System.out.println();
		
		linkedList.remove("mmm");
		dataArray = linkedList.toArray();
		for(Object data : dataArray) {
			System.out.print(data + "\t");
		}
		System.out.println();
	}

}
