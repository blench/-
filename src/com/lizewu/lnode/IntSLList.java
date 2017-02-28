package com.lizewu.lnode;

public class IntSLList {
	
	protected IntSLLNode head,tail;//设置一头节点和一尾节点
	public IntSLList()
	{
		head = tail = null;
	}
	
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	//插入数据到head中,同时将head指向下一节点
	public void addToHead(int e1)
	{
		head = new IntSLLNode(e1,head);
		if(tail == null)
		{
			tail = head;
		}
	}
	
	public void addToTail(int e1)
	{
		if(!isEmpty())
		{
			tail.next = new IntSLLNode(e1);
			tail = tail.next;
		}else{
			head = tail = new IntSLLNode(e1);
		}
	}
	
	public int deleteFromHead()
	{
		int e1 = head.info;
		if(head==null)
		{
			head = tail = null;
		}else{
			head = head.next;
		}
		return e1;
	}
	
	public int deleteFromTail()
	{
		int e1 = tail.info;
		if(head==null)
			head = tail = null;
		else{
			IntSLLNode tmp;
			for(tmp=head;tmp.next!=tail;tmp=tmp.next);
			tail = tmp;
			tail.next = null;
		}
		return e1;
	}
	
	public void printAll()
	{
		for(IntSLLNode tmp = head;tmp!=null;tmp=tmp.next)
		{
			System.out.print(tmp.info+" ");
		}
	}
	
	public boolean isInList(int e1)
	{
		IntSLLNode tmp;
		for(tmp = head;tmp != null&&tmp.info!=e1;tmp=tmp.next);
			return tmp!=null;
	}
	
	
	public void delete(int e1)
	{
		if(!isEmpty())
				if(head == tail && e1 == head.info)
						head = tail = null;
				else if(e1 == head.info)
						head = head.next;
				else{
					IntSLLNode pred,tmp;
					for(pred = head,tmp = head.next;
							tmp!=null && tmp.info!=e1;
							pred=pred.next,tmp=tmp.next);
					if(tmp!=null){
						pred.next = tmp.next;
						if(tmp != null){
							pred.next = tmp.next;
							if(tmp == tail)
								tail = pred;
						}
					}
				}
				
	}
	
}
