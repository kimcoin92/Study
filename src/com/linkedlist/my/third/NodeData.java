package com.linkedlist.my.third;

public class NodeData
{
	private int		value1;
	private String	value2;
	
	public NodeData()
	{
		
	}
	
	public NodeData(int _value1, String _value2)
	{
		value1 = _value1;
		value2 = _value2;
	}

	public int getValue1()
	{
		return value1;
	}

	public String getValue2()
	{
		return value2;
	}

	public void setValue1(int _value1)
	{
		value1 = _value1;
	}

	public void setValue2(String _value2)
	{
		value2 = _value2;
	}
	
	public void setData(int _value1, String _value2)
	{
		value1 = _value1;
		value2 = _value2;
	}
}
