package com.lizewu.factory2;


public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractHumanFactory yinyanglu = new HumanFactory();
		
		System.out.println("--造出的第一批人种是白色人种--");
		Human whiteMan = yinyanglu.createHuman(WhiteHuman.class);
		whiteMan.getColor();
		whiteMan.talk();
		
		System.out.println("--造出的第二批人种是黑色人种--");
		Human blackMan = yinyanglu.createHuman(BlackHuman.class);
		blackMan.getColor();
		blackMan.talk();
		
		
		System.out.println("--造出的第三批人种是黄色人种--");
		Human yellowMan = yinyanglu.createHuman(YellowHuman.class);
		yellowMan.getColor();
		yellowMan.talk();
	}

}
