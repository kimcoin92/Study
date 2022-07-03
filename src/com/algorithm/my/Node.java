/**
 * Creator : Kimcoin92
 * Date : 01 July, 2022
 * 
 * Name : Algorithm Exercise Program, Node Unit
 * 
 */

package com.algorithm.my;

public class Node
{
	private Node next;
	private Node prev;
	private Record data;
	private int  size;
	
	public Node()
	{
		next = null;
		prev = null;
		size = 0;
	}
	
	public Node(Record _data)
	{
		data = new Record();
		
		data = _data;
	}
	
	public Node(int _Value1, String _Value2)
	{
		data = new Record(_Value1, _Value2);
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

	public int getSize()
	{
		return size;
	}

	public Record getData()
	{
		return data;
	}

	public void setData(Record _data)
	{
		data = _data;
	}
}