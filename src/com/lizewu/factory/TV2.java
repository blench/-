package com.lizewu.factory;

public class TV2 implements TV {
	
	 public TV2() {
		System.out.println(this.getClass().getName()+"被生产出来了");
	}
}
