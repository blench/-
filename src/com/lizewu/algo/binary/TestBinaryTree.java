package com.lizewu.algo.binary;

import java.util.ArrayList;

public class TestBinaryTree {

	public TestBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.insert("George");
		tree.insert("Micheal");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		
		System.out.println("Inorder(sorted): ");
		tree.inorder();
		System.out.println("Postorder: ");
		tree.postorder();
		System.out.println("Preorder: ");
		tree.preorder();
		System.out.println("The number of nodes is "+tree.getSize());
		
		System.out.println("Is Peter in the tree?"+
				tree.search("Peter"));
		
		System.out.println("A path from the root to Peter is: ");
		
		ArrayList<BinaryTree.TreeNode<String>> path =
				tree.path("Peter");
		for(int i=0;path != null && i < path.size();i++)
		{
			System.out.println(path.get(i).element+" ");
		}
		Integer[] numbers = {2,4,3,1,8,5,6,7};
		BinaryTree<Integer> intTree = new BinaryTree<Integer>(numbers);
		System.out.println("Inorder (sorted): ");
		intTree.inorder();
	}

}
