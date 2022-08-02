package com.generic.fruits;

public class BoxFactory
{
	public static <T> SingleBox<T> makeEmptyBox()
	{		
		SingleBox<T> box = new SingleBox<T>();
		
		return box;
	}
	
	public static <T> SingleBox<T> makeBox(T _obj)
	{		
		SingleBox<T> box = new SingleBox<T>(_obj);
		
		return box;
	}
}
