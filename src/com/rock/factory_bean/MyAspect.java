package com.rock.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/**
 * 切面类中确定通知，需要实现不同接口，接口就是规范，从而确定方法名称；
 * 采用“环绕通知” MethodInterceptor
 * @author 王瑜12138
 *
 */
public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// 手动执行 目标方法
		System.out.println("前3");
		Object object=mi.proceed();
		System.out.println("后3");
		return object;
	}

}
