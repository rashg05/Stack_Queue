package com.bridgelab.stackandqueue;

public class MyNode<T> implements INode<T> {
	private T key;
	private INode next;
	public MyNode(T key) {
		this.key = key;
		this.next = null;
	}
	
	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}
	public void setNext(INode next) {
		this.next = (MyNode<T>)next;
	}
}
