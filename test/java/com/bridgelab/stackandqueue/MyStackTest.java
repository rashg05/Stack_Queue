package com.bridgelab.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		System.out.println("\nAdded to top");
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode= new MyNode<>(70);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
	}
	
	@Test
	public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode() {
		System.out.println("\nPoped with last added node");
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode= new MyNode<>(70);
		MyNode<Integer> mySecondNode= new MyNode<>(30);
		MyNode<Integer> myThirdNode= new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode popedNode = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, popedNode);
	}
}
