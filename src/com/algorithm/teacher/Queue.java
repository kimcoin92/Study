package com.algorithm.teacher;

public class Queue {
	private DoubleListContainer dlc;
	
	public Queue()
	{		
		dlc = new DoubleListContainer();
		
	}
	
	public int size()
	{
		return dlc.getCount();
		
	}
	
	public boolean enqueue(NodeData _data)
	{
		return dlc.insertNode(_data);
			
	}
	
	public boolean enqueue(int _value1, String _value2)
	{
		return dlc.insertNode(_value1, _value2);
		
	}
	
	public NodeData dequeue()
	{
		Node node = null;
		NodeData data = null;
		
		node = dlc.getNode(0);
		
		if (node == null)
		{
			return null;			
		}
		
		// 0번 노드데이터를 가지고 온다.
		data = node.getData();	
		// 0번 노드를 삭제한다.
		dlc.deleteNodebyIndex(0);
		
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
