package com.rock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		 HelloWorld obj = (HelloWorld) context.getBean("helloworld");
//		obj.setMessage("你好！");
//	      obj.getName();
//		 obj.getMessage();
	    //  ((AbstractApplicationContext) context).registerShutdownHook();
		 TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
//	     HelloWorld obja = (HelloWorld)context.getBean("helloworld");
//         obja.setMessage("我不好");
//	     obja.getMessage();
	}
}
