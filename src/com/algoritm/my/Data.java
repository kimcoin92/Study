package com.algoritm.my;

public class Data
{
	// Data의 종류는 정수형과 문자열형으로 구성했다.
	private int    value1;
	private String value2;
	
	public Data()
	{
		value1 = 0;
		value2 = null;
	}
	
	public Data(int _value1, String _value2)
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
}