package com.lizewu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {
	
	//被代理者
	Class cls = null;
	//被代理的实例
	Object obj = null;
	public GamePlayerIH(Object _obj) {
		// TODO Auto-generated constructor stub
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result = method.invoke(this.obj, args);
		//实现的动态代理,当执行了login是会执行相应的动作
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("有人在用我的账号登陆");
		}
		return result;
	}

}
