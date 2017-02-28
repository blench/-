package com.lizewu.builder;

import java.util.ArrayList;


/**
 * 抽象汽车组装者
 * 由他来组装汽车，顺序由客户决定
 */
public class BenzBuilder extends CarBuilder {

	private BenzModel benz = new BenzModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}

}
