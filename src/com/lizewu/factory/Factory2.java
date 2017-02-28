package com.lizewu.factory;

public class Factory2 implements Factory {

	@Override
	public TV createTV() {
		// TODO Auto-generated method stub
		return new TV2();
	}

	@Override
	public Wash createWash() {
		return new Wash2();
	}

}
