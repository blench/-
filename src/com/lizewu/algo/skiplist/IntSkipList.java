package com.lizewu.algo.skiplist;

import java.util.Random;

public class IntSkipList {
	
	private int maxLevel;//最高的层级数
	private IntSkipListNode [] root;
	private int [] powers;
	private Random rd = new Random();
	public IntSkipList()
	{
		this(4);
	}
	
	public IntSkipList(int i){
		maxLevel = i;
		root = new IntSkipListNode[maxLevel];//指向根节点
		powers = new int[maxLevel];
		for(int j = 0;j < maxLevel;j++)
			root[j] = null;
		choosePowers();
	} 
	
	public boolean isEmpty()
	{
		return root[0] == null;
	}
	
	public void choosePowers()
	{
		powers[maxLevel-1] = (2<<(maxLevel-1))-1;//2^maxLevel -1
		for(int i = maxLevel - 2,j = 0;i >= 0;i--,j++)
			powers[i] = powers[i+1] - (2 << j);
	}
	
	public int chooseLevel()
	{
		int i,r = Math.abs(rd.nextInt()) % powers[maxLevel-1] + 1;
		for(i=1;r < maxLevel;i++)
			if(r < powers[i])
				return i-1;
		return i-1;
	}
	
	public int skipListSearch(int key)
	{
		int lvl;
		IntSkipListNode prev,curr;
		for(lvl = maxLevel-1;lvl >= 0 && root[lvl] == null;lvl--);
		prev = curr = root[lvl];
		while(true){
			if(key == curr.key)
				return curr.key;
			else if(key < curr.key)
			{
				if(lvl == 0)
					return 0;
				else if(curr == root[lvl])
					curr = root[--lvl];
				else curr = prev.next[--lvl];
			}else{
				prev = curr;
				if(curr.next[lvl] !=null)
					curr = prev.next[lvl];
				else{
					
					for(lvl--;lvl>=0 && curr.next[lvl] == null;lvl--);
					if(lvl >=0)
						curr = curr.next[lvl];
					else return 0;
				}
			}
		}
	}
	
	public void skipListInsert(int key){
		
		IntSkipListNode[] curr = new IntSkipListNode[maxLevel];
		IntSkipListNode[] prev = new IntSkipListNode[maxLevel];
		IntSkipListNode newNode = null;
		int lvl,i;
		curr[maxLevel-1] = root[maxLevel-1];
		prev[maxLevel-1] = null;
		for(lvl = maxLevel - 1;lvl >= 0 ;lvl--){
			while(curr[lvl] != null && curr[lvl].key<key){
				prev[lvl] = curr[lvl];
				curr[lvl] = curr[lvl].next[lvl];
			}
			if(curr[lvl] != null && curr[lvl].key == key)
				return;
			if(lvl>0)
				if(prev[lvl] == null){
					curr[lvl-1] = root[lvl-1];
					prev[lvl-1] = null;
				}else{
					curr[lvl-1] = prev[lvl].next[lvl-1];
					prev[lvl-1] = prev[lvl];
				}
		}
		lvl = chooseLevel();
		
		newNode = new IntSkipListNode(key,lvl+1);
		for(i = 0;i<=lvl;i++){
			newNode.next[i] = curr[i];
			if(prev[i] == null)
				root[i] = newNode;
			else
				prev[i].next[i] = newNode;
		}
	}
}