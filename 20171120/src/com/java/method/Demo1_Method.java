package com.java.method;

public class Demo1_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123456";
		String s2 = "12345";
		String s3 = "1234";
		String s4 = "123";
		String s5 = "12";
		String s6 = "1";
		String s7 = null;
		System.out.println(s1.equals(s2));       //输出的两个相等（大小写）
		System.out.println(s1.equalsIgnoreCase(s3));     //输出的两个相等（忽略大小写）
		System.out.println(s1.contains(s4));      //是否为包含关系
		System.out.println(s1.startsWith(s5));      //是否从此处开始
		System.out.println(s1.endsWith(s6));      //是否从此处结束
		System.out.println(s6.isEmpty());     //字符串是否为空
	}

}
