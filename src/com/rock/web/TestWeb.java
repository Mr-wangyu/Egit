package com.rock.web;

import java.awt.Desktop.Action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWeb {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rock/web/Beans.xml");
		StudentAction student= (StudentAction) context.getBean("student");
		student.test();
	}
}
