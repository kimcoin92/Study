package com.algorithm.teacher;

import com.linkedlist.my.third.*;

public class Stack
{
	private ListContainer list1;
	@SuppressWarnings("unused")
	private Node[] frame;
	@SuppressWarnings("unused")
	private int sp;
	
	public Stack()
	{
		list1 = new ListContainer();
		frame = null;
		sp = 0;
	}
	
	public boolean push(NodeData _data)
	{
		boolean result;
		
		result = list1.insertNode(_data);
		
		return result;
	}
	
	public boolean push(int _value1, String _value2)
	{
		boolean result;
		
		result = list1.insertNode(_value1, _value2);
		
		return result;
	}
	
	public NodeData pop()
	{
		int lastIndex = list1.getCount() - 1;
		
		Node lastNode = list1.getNode(lastIndex);
		NodeData data = lastNode.getData();
		
		list1.deleteNode(lastIndex);
		
		return data;
	}
}
