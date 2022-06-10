package com.algorithm.my.list;

public class Node
{
	private Dat data;
	private Node next;
	private Node prev;
	
	public Node()
	{
		
	}
	
	public Node(Dat _data)
	{
		this.data = _data;
	}
	
	public Dat getData()
	{
		return data;
	}

	public void setData(Dat data)
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

	public Node getPrev()
	{
		return prev;
	}

	public void setPrev(Node prev)
	{
		this.prev = prev;
	}


}
