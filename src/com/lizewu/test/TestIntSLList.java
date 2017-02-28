package com.lizewu.test;

import com.lizewu.find.SLList;

public class TestIntSLList {

	public TestIntSLList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IntSLList list = new IntSLList();
		
		SLList list = new SLList();
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		
		
		list.printAll();
		System.out.println();
		
		
		
		list.delete(1);
		list.printAll();

	}
	
	

}
