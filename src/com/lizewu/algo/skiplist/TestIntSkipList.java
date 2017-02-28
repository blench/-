package com.lizewu.algo.skiplist;

import org.junit.Test;

/**
 * 一个抽象类可以继承一个非抽象类
 * @author lizewu
 *
 */
public class TestIntSkipList {
	
	IntSkipList list = new IntSkipList();
	
	
	
	public TestIntSkipList()
	{
		
	}
	@Test
	public void testChoosePowers() {
	
	}

	@Test
	public void testChooseLevel() {
	
	}

	@Test
	public void testSkipListSearch() {
		for(int i=0;i<10;i++)
		{
			list.skipListInsert(i);
		}
		//下标从零开始
		int position = list.skipListSearch(9);
		System.out.println(position);
	}

	@Test
	public void testSkipListInsert() {
		int key = 1;
		Object oj = new Object();
		
		
	}

}
