package com.rock.factory_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
	public static void main(String[] args) {
		
	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/rock/factory_bean/Beans.xml");
	UserService userService = (UserService) context.getBean("userService");
	userService.addUser();
	userService.updateUser();
	userService.deleteUser();
	
	}
	
}
