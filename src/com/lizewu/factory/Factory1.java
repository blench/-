package com.lizewu.factory;

public class Factory1 implements Factory {

	@Override
	public TV createTV() {
		// TODO Auto-generated method stub
		return new TV1();
	}

	@Override
	public Wash createWash() {
		// TODO Auto-generated method stub
		return new Wash1();
	}

}
