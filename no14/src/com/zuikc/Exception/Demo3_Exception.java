package com.zuikc.Exception;

public class Demo3_Exception {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person a = new Person("rr",33);
		System.out.println(a.getAge());
		Person b = new Person();
		b.setAge(33);
		
	}

}
class Person{
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		if (age < 0 && age >200) {
			this.age = age;
		}else {
			throw new Exception("�Ƿ�����");
		}
	}
}
