package com.algorithm.my.newlinked;

public class LinkedList
{
	public static void main(String[] args)
	{
		ListContainer list = new ListContainer();
		
		list.insertNode(10, "A");
		list.insertNode(20, "B");
		list.insertNode(30, "C");
		list.insertNode(40, "D");
		
		list.deleteAll();
		
		list.printAll();
	}
}