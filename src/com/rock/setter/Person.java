package com.rock.setter;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Person {
	private String pname;
	private int age;
	private Address homeaddr;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getHomeaddr() {
		return homeaddr;
	}
	public void setHomeaddr(Address homeaddr) {
		this.homeaddr = homeaddr;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", homeaddr="
				+ homeaddr + "]";
	}
	
}
