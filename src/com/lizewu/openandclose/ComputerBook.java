package com.lizewu.openandclose;

public class ComputerBook implements IComputerBook {
	
	private String name;
	
	private String scope;
	
	private String author;
	
	private int price;
	
	public ComputerBook(String _name,int _price,String _author,String _scope)
	{
		this.name = _name;
		this.price = _price;
		this.author = _author;
		this.scope = _scope;
	}
	public ComputerBook() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String getScope() {
		// TODO Auto-generated method stub
		return this.scope;
	}

}
