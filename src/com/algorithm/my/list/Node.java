package com.algorithm.my.list;

public class Node
{
	private Memory element;
	private Node next;
	private Node prev;
	
	public Node()
	{
		
	}
	
	public Node(Memory _element)
	{
		this.element = _element;
	}
	
	public Memory getElement()
	{
		return element;
	}

	public void setElement(Memory element)
	{
		this.element = element;
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
