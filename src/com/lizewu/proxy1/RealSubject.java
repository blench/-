package com.lizewu.proxy1;

public class RealSubject implements Subject {

	@Override
	public void doSomething(String str) {
		// TODO Auto-generated method stub
		System.out.println("do something!---->"+str);
	}

}
