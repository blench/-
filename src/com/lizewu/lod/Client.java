package com.lizewu.lod;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//产生一个女生群体
		List<Gril> grils = new ArrayList<Gril>();
		
		//初始化女生
		for(int i=0;i<20;i++)
		{
			grils.add(new Gril());
		}
		
		Teacher t = new Teacher();
		t.command(new GroupLeader(grils));
	}

}
