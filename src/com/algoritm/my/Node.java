package com.algoritm.my;

public class Node
{
	@SuppressWarnings("unused")
	private Node head;
	@SuppressWarnings("unused")
	private Node tail;
	@SuppressWarnings("unused")
	private int  size;
	
	@SuppressWarnings("unused")
	private Data record;
	
	public Node()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public Node(Data _record)
	{
		record = new Data();
		
		record = _record;
	}
	
	public Node(int _Value1, String _Value2)
	{
		record = new Data(_Value1, _Value2);
	}
}