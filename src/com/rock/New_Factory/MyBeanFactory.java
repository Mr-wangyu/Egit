package com.rock.New_Factory;

public class MyBeanFactory {
	public UserService creatService(){
		return new UserServiceImpl();
		
	}
			
		
	
}
