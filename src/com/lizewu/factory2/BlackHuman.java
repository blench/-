package com.lizewu.factory2;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("黑色人种的皮肤是黑色的");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("黑人会说话，但一般人听不懂");
	}

}
