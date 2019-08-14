package com.rock.spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		
	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/rock/spring_aop/Beans.xml");
	UserService userService = (UserService) context.getBean("userService");
	userService.addUser();
	userService.updateUser();
	userService.deleteUser();
	
	}
	
}
