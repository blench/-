package com.lizewu.dip3;

import com.lizewu.dip3.AbstractSearcher;

public class Searcher extends AbstractSearcher {

	public Searcher(IGoodBodyGril _prettyGril) {
		super(_prettyGril);
		// TODO Auto-generated constructor stub
	}
	
	public Searcher(IGreateTemperamentGril _greateTemGril) {
		// TODO Auto-generated constructor stub
		super(_greateTemGril);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("--------美女的信息如下--------");
		
		super.goodBodyGril.goodLooking();
		
		super.goodBodyGril.niceFigure();
		
		super.greateTemperamentGril.greateTemperament();
	}

}
