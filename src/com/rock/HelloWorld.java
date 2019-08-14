package com.rock;

import org.springframework.beans.factory.annotation.Required;

public class HelloWorld {
private String message;
private String name;
public void getName() {
	System.out.println("Your name:"+name);
;
}
@Required
public void setName(String name) {
	this.name = name;
}

public void getMessage() {
	System.out.println("Your Message:"+message);
}
@Required
public void setMessage(String message) {
	this.message = message;
}
	public void init(){
		System.out.println("bean is going now");
	}
	public void destroy(){
		System.out.println("bean is destroying now");
	}
}
