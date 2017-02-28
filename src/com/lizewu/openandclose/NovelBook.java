package com.lizewu.openandclose;

public class NovelBook implements IBook {
	
	private String name;
	
	private int price;
	
	private String author;
	
	public NovelBook(String _name,int _price,String _author) {
		// TODO Auto-generated constructor stub
		this.name = _name;
		this.price = _price;
		this.author = _author;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return this.author;
	}

}
