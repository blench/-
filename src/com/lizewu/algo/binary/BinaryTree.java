package com.lizewu.algo.binary;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree <E extends Comparable<E>>
	extends AbstractTree<E>
{
	protected  TreeNode<E> root;
	protected int size = 0;

	public BinaryTree() {
		
		// TODO Auto-generated constructor stub
	}

	public BinaryTree(E[] objects) {
		for(int i = 0;i < objects.length; i++)
		{
			insert(objects[i]);
		}
	}

	@Override
	public boolean search(E e) 
	{
		TreeNode<E> current = root;
		
		while(current != null)
		{
			if(e.compareTo(current.element) < 0)
			{
				current = current.left;
			}
			else if(e.compareTo(current.element) < 0)
			{
				current = current.right;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

	
	public boolean insert(E e)
	{
		if(root == null)
		{
			root = createNewNode(e);
		}
		else
		{
			TreeNode<E> parent = null;
			TreeNode<E> current = null;
			while(current != null)
			{
				if(e.compareTo(current.element) < 0)
				{
					parent = current;
					current = current.left;
				}
				else if(e.compareTo(current.element) > 0)
				{
					parent = current;
					current = current.right;
				}
				else
					return false;
				
				if(e.compareTo(parent.element) < 0)
					parent.left = createNewNode(e);
				else
					parent.right = createNewNode(e);
		
		size++;
			}
		}
		return true;
	}
	
	protected TreeNode<E> createNewNode(E e)
	{
		return new TreeNode<E>(e);
	}
	
	@Override
	public void inorder() 
	{
		// TODO Auto-generated method stub
		inorder(root);
	}
	
	protected void inorder(TreeNode<E> root) 
	{
		// TODO Auto-generated method stub
		if(root == null) 
			return;
		inorder(root.left);
		System.out.println(root.element + "");
		inorder(root.right);
	}
	
	@Override
	public void postorder()
	{
		// TODO Auto-generated method stub
		postorder(root);
	}
	
	protected void postorder(TreeNode<E> root) 
	{
		// TODO Auto-generated method stub
		if(root == null) 
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.element + "");
		postorder(root.right);
	}
	
	@Override
	public void preorder() 
	{
		preorder(root);
	}
	
	protected void preorder(TreeNode<E> e) 
	{
		if(root == null )
			return;
		System.out.println(root.element+"");
		preorder(root.left);
		preorder(root.right);
	}
	
	public  static class TreeNode<E  extends Comparable <E>>
	{
		E element;
		TreeNode<E> left;
		TreeNode<E> right;
		
		public TreeNode() 
		{
			// TODO Auto-generated constructor stub
		}
		
		public TreeNode(E e) 
		{
			element = e;
		}
	}
		
		public int getSize()
		{
			return size;
		}
		
		public TreeNode getRoot()
		{
			return root;
		}
		
		public ArrayList<TreeNode<E>> path(E e)
		{
			ArrayList <TreeNode<E>> list = new ArrayList<TreeNode<E>>();
			TreeNode<E> current = root;
			
			while(current != null)
			{
				list.add(current);
				if(e.compareTo(current.element)<0)
				{
					current = current.left;
				}
				else if(e.compareTo(current.element)>0)
				{
					current = current.right;
				}
				else
					break;
			}
			return list;
		}
		
	public boolean delete(E e)
	  {
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		while(current!=null)
		
			if(e.compareTo(current.element) < 0)
			{
				parent = current;
				current = current.left;
			}
			else if(e.compareTo(current.element) > 0)
			{
				parent = current;
				current = current.right;
			}
			else
				break;
		
		if(current == null)
		{
			return false;
		}
		
		if(current.left == null)
		{
			if(parent == null)
			{
				current = current.right;
			}
			else
			{
				if(e.compareTo(parent.element) < 0)
					parent.left = current.left;
				else
					parent.right = current.left;
			}
		}
		else
		{
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;
			
			while(rightMost.right != null)
			{
				parentOfRightMost = rightMost;
				rightMost = rightMost.right;
			}
			
			current.element = rightMost.element;
			
			if(parentOfRightMost.right == rightMost)
			{
				parentOfRightMost.right = rightMost.left;
			}
			else
			{
				parentOfRightMost.left = rightMost.left; 
			}
		}
			size++;
			return true;
		}
		
		public Iterator iterator()
		{
			return inorderIterator();
		}
		
		public Iterator inorderIterator()
		{
			return new InorderIterator();
		}
	
	
	class InorderIterator implements Iterator {

		private ArrayList<E> list = new ArrayList<E>();
		private int current = 0;
		public InorderIterator() {
			// TODO Auto-generated constructor stub
			inorder();
		}
		private void inorder() {
			// TODO Auto-generated method stub
			inorder(root);
		}
		
		private void inorder(TreeNode<E> e) {
			if(root == null)
				return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(current < list.size())
				return true;
			return false;
		}
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return list.get(current++);
		}
		@Override
		public void remove() {
			delete(list.get(current));
			list.clear();
			inorder();
		}
	}
	
		public void clear() {
			// TODO Auto-generated method stub
			root = null;
			size = 0;
		}
	
}




