package com.lizewu.factory;

public class Client {

	public static void main(String[] args) {
		Factory factory1 = new Factory1();
		factory1.createTV();
		factory1.createWash();
		
		
		Factory factory2 = new Factory2();
		factory2.createTV();
		factory2.createWash();
	}

}
