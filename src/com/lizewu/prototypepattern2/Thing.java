package com.lizewu.prototypepattern2;

import java.util.ArrayList;

public class Thing implements Cloneable {
	//定义一个私有变量
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	@SuppressWarnings("unchecked")
	public Thing clone()
	{
		Thing thing = null;
		try{
			//浅拷贝
			thing = (Thing)super.clone();
			//深拷贝
			thing.arrayList = (ArrayList<String>) this.arrayList.clone();
		}catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		return thing;
	}

	
	
	//设置HashMap的值
	public void setValue(String value)
	{
		this.arrayList.add(value);
	}
	
	//取得arrayList的值
	public ArrayList<String> getValue()
	{
		return this.arrayList;
	}
}
