package com.lizewu.find;

import java.io.PrintStream;

public class SLList {
	
	protected SLLNode head = null;
	public SLList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public Object first()
	{
		return head.info;
	}
	
	public void printAll()
	{
		for(SLLNode tmp=head;tmp!=null;tmp=tmp.next)
				System.out.print(tmp.info+" ");
	}
	
	public void add(Object e1)
	{
		head = new SLLNode(e1,head);
	}
	
	public Object find(Object e1)
	{
		SLLNode tmp = head;
		for(;tmp!=null && e1.equals(tmp.info);tmp=tmp.next);
			if(tmp == null)
				return null;
			else
				return tmp.info;
	}
	
	public Object deleteHead()
	{
		Object e1 = head.info;
		head = head.next;;
		return e1;
	}
	
	public void delete(Object e1)
	{
		if(head!=null)
			if(e1.equals(head.info))
				head = head.next;
			else{
				SLLNode pred = head ,tmp = head.next;
				for(;tmp!=null && !(tmp.info.equals(e1));
						pred = pred.next,tmp = tmp.next);
				if(tmp!=null)
					pred.next = tmp.next;
			}
	}
}
