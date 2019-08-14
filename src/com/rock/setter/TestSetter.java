package com.rock.setter;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rock/setter/Beans.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		
	}
}
