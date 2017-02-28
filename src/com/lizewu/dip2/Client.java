package com.lizewu.dip2;



public class Client {
	
	public static void main(String[] args) {
		IPrettyGril  yanyan = new Pretty("妍妍");
		AbstractSearcher searcher = new Searcher(yanyan);
		searcher.show();
	}
}
