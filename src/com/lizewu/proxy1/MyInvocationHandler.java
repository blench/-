package com.lizewu.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	
	
	//被代理的对象
	private Object target = null;
	
	public MyInvocationHandler(Object _obj)
	{
		this.target = _obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		//执行被代理的方法
		return method.invoke(this.target, args);
	}

}
