package com.example.teacher.generic.restrict;

public class BoxFactory
{
	public static <T> Box<T> makeEmptyBox()
	{		
		Box<T> box = new Box<T>();
		
		return box;
	}
	
	public static <T> Box<T> makeBox(T _obj)
	{		
		Box<T> box = new Box<T>(_obj);
		
		return box;
	}
}
