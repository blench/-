package com.lizewu.factory3;

public class FemaleFactory implements HumanFactory {

	
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new FemaleYellowHuman();
	}

	
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new FemaleWhiteHuman();
	}

	
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new FemaleBlackHuman();
	}

}
