package com.lizewu.factory3;

/***
 * 抽象工厂模式
 * @author lizewu
 *
 */

public abstract class AbstractBlackHuman implements Human {

	
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("黑色人种的皮肤颜色是黑色的");
	}

	
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println(" 黑色人种会说话，一般说的别人都不懂。");
	}

}
