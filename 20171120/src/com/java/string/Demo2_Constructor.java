package com.java.string;

public class Demo2_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		//demo3();
		String s = "abc";
		String s2 = new String(s);
		System.out.println(s2);
	}

	static void demo3() {
		byte[] arr= {97,98,99,100,101,102};
		String s1 = new String(arr,0,4);     //意思为从索引值0开始截取  截取4位
		System.out.println(s1);
	}

	static void demo2() {
		byte[] arr = {97,98,99};
		String s1 = new String(arr);
		System.out.println(arr);         //输出对象的地址值
		System.out.println(s1);			// 根据AC表输出abc
	}

	static void demo1() {
		String s1 = new String();
		System.out.println(s1);     //默认为空字符串的
		
		String s2 = "";
		System.out.println(s2);   //同样为空字符串
	}

}
