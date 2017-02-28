package com.lizewu.factory3;

public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HumanFactory maleHumanFactory = new MaleFactory();
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
		System.out.println("--生产一个黄色女性--");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		
		System.out.println("--生产一个黄色男性--");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
	}

}
