package com.stack;

class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}


class StackLinkedList {
	Node top;		// equal to top of -1  by default null 
	
	public void push(int data) {
		
		Node newNode = new Node(data);		// node object ready. which has property is data and same class reference. 
		
		newNode.next=top;					// top is reference of next 
		
		top = newNode;
		System.out.println(data+"Pushed in stack");
	}
	
	public int pop() {
		if(top==null) {
			System.out.println("Stack is empty");
			return -1;
		}
		int value = top.data;
		top = top.next;
		return value;
	}
	public int peek() {
		if(top==null) {
			System.out.println("Stack is empty");
			return -1;
		}
		int value = top.data;
		return value;
	}
	
	public void display() {
		if(top==null) {
			System.out.println("Stack empty");
		}
		Node temp = top;			// 200 value node 
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

class StackArray {
	int maxSize;
	int top;
	int stack[];
	public StackArray(int maxSize) {
		this.maxSize=maxSize;
		top = -1;
		stack = new int[maxSize];
	}
	public void push(int data) {
		if(top==maxSize-1) {	// top -1==4
			System.out.println("Stack is overflow or full ");
			return;
		}
		stack[++top]=data;
		System.out.println(data+" pushed...");
	}
	public int pop() {
		if(top==-1) {	
			System.out.println("Stack is empty ");
			return -1;
		}
		return stack[top--];
	}
	public int peek() {
		if(top==-1) {	
			System.out.println("Stack is empty ");
			return -1;
		}
		return stack[top];
	}
	public boolean isEmpty() {
		return top ==-1;
	}
}

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StackArray stack  = new StackArray(5);
//		System.out.println(stack.pop());
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		stack.push(60);
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		
		StackLinkedList sll = new StackLinkedList();
		sll.push(100);			// node -->data value is 100 next is top. 
		sll.push(200);			// node -->data value is 200 next is top 
		sll.push(300);			// 300 
		sll.pop();				// remove 300 
		System.out.println(sll.peek());				// display 
		sll.display();
		
	}

}
