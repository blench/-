package com.lizewu.openandclose;

public class OffNovelBook extends NovelBook {

	public OffNovelBook(String _name, int _price, String _author) {
		super(_name, _price, _author);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		int price =  super.getPrice();
		int offPrice = 0;
		if(price>4000)
		{
			offPrice = price * 90 /100;
		}else{
			offPrice = price * 80 /100;
		}
		return offPrice;
	}
}
