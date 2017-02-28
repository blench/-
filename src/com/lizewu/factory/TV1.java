package com.lizewu.factory;

public class TV1 implements TV {
	
	public TV1() {
		
		System.out.println(this.getClass().getName()+"被生产出来了");
		
	}
}
