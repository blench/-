package com.lizewu.singleton;

public class Minister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义5个大臣
		int ministerNum = 5;
		for(int i=0;i<ministerNum;i++)
		{
			Emperor emperor = Emperor.getEmperor();
			System.out.print("第"+(i+1)+"大臣参拜的是：");
			emperor.say();
		}
	}

}
