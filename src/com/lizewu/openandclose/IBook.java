package com.lizewu.openandclose;

//开闭原则，只对扩展开放，禁止修改
public interface IBook {
	
	public String getName();
	
	public int getPrice();
	
	public String getAuthor();
}
