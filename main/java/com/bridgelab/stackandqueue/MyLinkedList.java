package com.bridgelab.stackandqueue;

public class MyLinkedList {
	public INode head;
	public INode tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode newNode ) {
		if(this.head == null)
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return  tempNode;
	}
	
	public void apend(INode newNode) {
		if(this.head == null)
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void printMyNodes() {

		StringBuffer myNodes = new StringBuffer ("My Nodes: "); 
		INode tempNode = head;
		while (tempNode.getNext() != null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals (tail)) myNodes.append("->"); 
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println (myNodes);
	}
}
