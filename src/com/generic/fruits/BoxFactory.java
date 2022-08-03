package com.generic.fruits;

public class BoxFactory
{
	// <?> 여기가 원래 T(Integer, String)같은 내용물을 넣는데
	// ?가 들어갔을때는 완벽한 T의 역할을 해준다.
	public static void func(SingleBox<?> box)
	{
		
	}
	
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
