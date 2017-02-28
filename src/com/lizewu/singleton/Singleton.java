package com.lizewu.singleton;

public class Singleton {
	
	private static final Singleton singleton = new Singleton();
	
	private Singleton()
	{
		
	}
	
	//通过该方法获取实例
	public static Singleton getSingleton()
	{
		return singleton;
	}
	
	//类中其他方法，尽量是static
	
	public  static void doSomething()
	{
		
	}
	
}
