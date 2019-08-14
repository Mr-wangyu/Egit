package com.rock.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rock/scope/Beans.xml");
		
		
		UserService userService = (UserService) context.getBean("userService");
		UserService userService2 = (UserService) context.getBean("userService");
		System.out.println(userService);
		System.out.println(userService2);
	}
}
