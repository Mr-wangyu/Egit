package com.rock.jdk;

public class MyBeanFactory {
	public static UserService createService(){
		return new UserServiceImpl();
		
	}
}
