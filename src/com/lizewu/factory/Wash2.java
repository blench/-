package com.lizewu.factory;

public class Wash2 implements Wash {
	
	public Wash2() {
		System.out.println(this.getClass().getSimpleName()+"被生产出来了");
	}

	@Override
	public void openVideo() {
		// TODO Auto-generated method stub
		
	}
}
