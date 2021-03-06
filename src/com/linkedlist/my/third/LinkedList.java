package com.linkedlist.my.third;

public class LinkedList
{
	public static void test_getNode()
	{
		// getNode
		ListContainer list = new ListContainer();
		
		@SuppressWarnings("unused")
		Node node = null;
		
		for (int i = 0; i < 1000; i++)
		{
			list.insertNode(i + 1, "data");
		}
		// _index < 0
		// _index >= count
		node = list.getNode(0);
		node = list.getNode(-1);
		node = list.getNode(1001);
		
		// _index <= middle
		node = list.getNode(0);
		node = list.getNode(250);
		node = list.getNode(499);
		node = list.getNode(500);
		
		// _index > middle
		node = list.getNode(501);
		node = list.getNode(750);
		node = list.getNode(999);
	}
}
