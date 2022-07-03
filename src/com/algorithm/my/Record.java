/**
 * Creator : Kimcoin92
 * Date : 03 July, 2022
 * 
 * Name : Algorithm Exercise Program, Data Unit (Record)
 * 
 */

package com.algorithm.my;

public class Record
{
	private int    value1;
	private String value2;
	
	public Record()
	{
		value1 = 0;
		value2 = "";
	}
	
	public Record(int _value1, String _value2)
	{
		value1 = _value1;
		value2 = _value2;
	}

	public int getValue1()
	{
		return value1;
	}

	public void setValue1(int _Value1)
	{
		value1 = _Value1;
	}

	public String getValue2()
	{
		return value2;
	}

	public void setValue2(String _value2)
	{
		value2 = _value2;
	}
	
	public void setRecord(int _value1, String _value2)
	{
		value1 = _value1;
		value2 = _value2;
	}

	@Override
	public String toString()
	{
		return "Data [value1=" + value1 + ", value2=" + value2 + "]";
	}
}