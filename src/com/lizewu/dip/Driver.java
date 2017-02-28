package com.lizewu.dip;

public class Driver implements IDriver {

	@Override
	public void drive(ICar car) {
		// TODO Auto-generated method stub
		car.run();
	}

}
