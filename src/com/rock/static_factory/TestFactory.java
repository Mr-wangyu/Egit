package com.rock.static_factory;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UserService userService= (UserService) context.getBean("userService");
		userService.userServiceImpl();
	}
}
