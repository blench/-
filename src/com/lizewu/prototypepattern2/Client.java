package com.lizewu.prototypepattern2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//产生一个对象
		Thing thing = new Thing();
		thing.setValue("张三");
		Thing cloneThing = thing.clone();
		cloneThing.setValue("李四");
		System.out.println(thing.getValue());
	}

}
