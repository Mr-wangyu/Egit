package com.rock1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressSet();
	}

}
