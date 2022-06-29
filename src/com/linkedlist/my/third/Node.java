package com.linkedlist.my.third;

public class Node
{
	private Node next;
	private Node prev;
	private NodeData data;
	
	public Node()
	{
		next = null;
		prev = null;
		data = null;
	}
	
	public Node(int _value1, String _value2)
	{
		data = new NodeData(_value1, _value2);
	}

	public Node getNext()
	{
		return next;
	}

	public void setNext(Node _next)
	{
		next = _next;
	}
	
	public Node getPrev()
	{
		return prev;
	}

	public void setPrev(Node _prev)
	{
		prev = _prev;
	}

	public NodeData getData()
	{
		return data;
	}

	public void setData(NodeData _data)
	{
		data = _data;
	}
	
	@Override
	public String toString()
	{
		return "data = " + data;
	}
}
