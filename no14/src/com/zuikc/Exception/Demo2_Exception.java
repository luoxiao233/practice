package com.zuikc.Exception;

public class Demo2_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 m = new Demo2();
		try {
			System.out.println(m.div(3, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}
class Demo2{
	public int div(int a,int b){
		return a / b;
	}
}
