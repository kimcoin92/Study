package com.generic.teacher.wildcard;

public class BoxFactory
{
	// <?> 여기가 원래 T(Integer, String)같은 내용물을 넣는데
	// ?가 들어갔을때는 완벽한 T의 역할을 해준다.
	public static void func(Box<?> box)
	{
		
	}
}
