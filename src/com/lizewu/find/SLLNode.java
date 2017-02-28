package com.lizewu.find;

public class SLLNode {
	
	public Object info;
	public SLLNode next;
	
	 
	public SLLNode() {
		next = null;
	}
	
	public SLLNode(Object e1)
	{
		info = e1;next = null;
	}
	
	public SLLNode(Object e1,SLLNode ptr)
	{
		info = e1;
		next = ptr;
	}
}
