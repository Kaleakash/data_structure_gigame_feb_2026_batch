package com.tree.examples;

class Node {
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left = this.right=null;	
	}
	void inorder(Node root) {
	    if (root == null) return;
	    inorder(root.left);
	    System.out.print(root.data + " ");
	    inorder(root.right);
	}
	boolean search(Node root, int key) {
	    if (root == null) return false;
	    if (root.data == key) return true;
	    if (key < root.data)
	        return search(root.left, key);
	    else
	        return search(root.right, key);
	}

}
public class TreeTest {

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(7);
		root.left.left=new Node(2);
		root.left.right=new Node(4);
									
		//root.inorder(root);
		boolean result = root.search(root, 10);
		System.out.println("result is "+result);
	}

}
