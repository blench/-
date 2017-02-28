package com.lizewu.factory;

public class Wash1 implements Wash {
	
	public Wash1()
	{
		System.out.println(this.getClass().getName()+"被生产出来了");
	}

	@Override
	public void openVideo() {
		// TODO Auto-generated method stub
		
	}
}
