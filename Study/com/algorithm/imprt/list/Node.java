package com.algorithm.imprt.list;

public class Node 
{
	private NodeData data;
	private Node 	 next;

	public Node()
	{
		data = null;
		next = null;
		
	}
	
	public Node(NodeData data)
	{
		this.data = data;
		next = null;	
		
	}
	
	public Node(int value1, String value2)
	{
		data = new NodeData(value1, value2);
		next = null;		
		
	}

	public NodeData getData() 
	{
		return data;
	}

	public void setData(NodeData data) 
	{
		this.data = data;
	}

	public Node getNext() 
	{
		return next;
	}

	public void setNext(Node next) 
	{
		this.next = next;
	}
	
}
