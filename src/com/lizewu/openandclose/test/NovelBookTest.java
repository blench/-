package com.lizewu.openandclose.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lizewu.openandclose.IBook;
import com.lizewu.openandclose.NovelBook;

public class NovelBookTest {
	
	private String name = "平凡的世界";
	
	private int price = 6000;
	
	private String author = "路遥";
	
	private IBook novelBook = new NovelBook(name,price,author);
	@Test
	public void testGetPrice() {
		
	}

}
