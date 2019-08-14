package com.rock.static_factory;

public class MyBeanFactory {
	/**
	 * 创建实例
	 * @return
	 */
	public static UserService createService(){
		return new UserServiceImpl();
		
	}
}
 