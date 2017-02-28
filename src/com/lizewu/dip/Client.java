package com.lizewu.dip;

public class Client {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDriver zhangsan = new Driver();
		ICar benz = new Benz();
		ICar bmw = new BMW();
		
		zhangsan.drive(benz);
		zhangsan.drive(bmw);
	}

}
