package com.collection.teacher.hashset;


import java.util.Objects;

@SuppressWarnings("unused")
public class IntValue
{
	private int value;
	
	public IntValue ()
	{
		value = 0;
	}
	
	public IntValue (int _value)
	{
		value = _value;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int _value)
	{
		value = _value;
	}

	@Override
	public String toString()
	{
		return "IntValue [value=" + value + "]";
	}
	
	// 같냐 다르냐를 판단한다.
	// 유일한 값만 가지려면 equals가 필요하다.
	@Override
	public boolean equals(Object _obj)
	{
		boolean result = false;
		
		try
		{
			if(value == ((IntValue)(_obj)).value)
			{
				result = true;
			}
			else
			{
				result = false;
			}
		}
		catch (Exception excp)
		{
			result = false;
		}
		return result;
	}
	
	// 분류한다.
	@Override
	public int hashCode()
	{
		return value % 3;
	}
	
	
}