package com.lizewu.dip3;

import com.lizewu.dip3.AbstractSearcher;

public class Client {
	
	public static void main(String[] args) {
		IGoodBodyGril  yanyan = new PrettyGril("妍妍");
		IGreateTemperamentGril yanyan2 = new PrettyGril("妍妍");
		AbstractSearcher searcher = new Searcher(yanyan);
		AbstractSearcher searcher2 = new Searcher(yanyan2);
		
		searcher.show();
		searcher2.show();
	}
}
