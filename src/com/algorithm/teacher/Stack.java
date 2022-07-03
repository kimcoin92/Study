package com.algorithm.teacher;

public class Stack {
	private DoubleListContainer dlc;
	
	
	public Stack()
	{
		dlc = new DoubleListContainer();
	}
			
	public int size()
	{
		return dlc.getCount();
		
	}
	
	public boolean push(NodeData _data)
	{
		boolean result;
	
		result = dlc.insertNode(_data);
		
		return result;
		
	}
	
	public boolean push(int _value1, String _value2)
	{		
		return dlc.insertNode(_value1, _value2);
		
	}
	
	public NodeData pop()
	{
		int lastIndex = dlc.getCount() - 1;
		
		Node lastNode = dlc.getNode(lastIndex);		
		NodeData data = lastNode.getData();
		
		dlc.deleteNodebyIndex(lastIndex);		
		
		return data;
	
	}
	
	public void printAll()
	{
		dlc.printAll();
		
	}
	
	public void cleanUp()
	{
		dlc.deleteAll();
		
	}

}
