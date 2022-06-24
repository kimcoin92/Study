package com.example.teacher.generic.fruits;

public class Box <T> {
	
	private T obj;
	
	public Box()
	{
		
	}
	
	public Box(T _obj)
	{
		obj = _obj;
	}
	
	public void set(T _obj)
	{
		obj = _obj;
	}

	public T get()
	{
		return obj;
	}
}