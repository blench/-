package com.lizewu.proxy1;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//定义一个主题
		Subject subject = new RealSubject();
		//定义一个Handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		//定义主题的代理
//		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
//				subject.getClass().getInterfaces(), 
//				handler);
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		//代理的行为
		proxy.doSomething("Finish");
	}

}
