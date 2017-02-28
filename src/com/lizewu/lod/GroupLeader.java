package com.lizewu.lod;

import java.util.List;

public class GroupLeader {

	private List<Gril> listGrils;
	//传递全班的女生数过来
	public GroupLeader(List<Gril> grils)
	{
		this.listGrils = grils;
	}
	
	//清点人数
	public void count()
	{
		System.out.println("女生的人数是:"+listGrils.size());
	}
}
