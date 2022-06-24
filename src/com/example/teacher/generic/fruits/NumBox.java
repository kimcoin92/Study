package com.example.teacher.generic.fruits;

// Number와 Number를 상속받은 클래스만 받아주고 싶다.
public class NumBox<T extends Number>
{
	private T obj;
	
	public NumBox(T _obj)
	{
		obj = _obj;
	}

	public int getIntNumber()
	{
		return obj.intValue();
	}
}
