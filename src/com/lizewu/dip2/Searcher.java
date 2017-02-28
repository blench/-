package com.lizewu.dip2;

import com.lizewu.dip2.AbstractSearcher;

public class Searcher extends AbstractSearcher {

	public Searcher(IPrettyGril _prettyGril) {
		super(_prettyGril);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("--------美女的信息如下--------");
		
		super.prettyGril.goodLooking();
		
		super.prettyGril.niceFigure();
		
		super.prettyGril.greateTemperament();
	}

}
