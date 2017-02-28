package com.lizewu.lod2;

import java.util.Random;

/**
 * 迪米特法则,朋友间也是有距离的
 * @author lizewu
 *
 */
public class Wizard {
	
	private Random random = new Random(System.currentTimeMillis());
	
	//第一步
	private int first()
	{
		System.out.println("执行第一个方法...");
		return random.nextInt(100);
	}
	
	//第二步
	private int second()
	{
		System.out.println("执行第二个方法...");
		return random.nextInt(100);
	}
	
	//第三步
	private int third()
	{
		System.out.println("执行第三个方法...");
		return random.nextInt(100);
	}
	
	//软件安装过程
	public void installWizard(){
		int first = this.first();
		
		//根据first方法返回的结果来判断是否执行second方法
		if(first>50){
			int second = this.second();
			if(second>50){
				int third = this.third();
				if(third>50)
					this.first();
			}
			
		}
	}
}
