package com.linkedlist.my.third;

public class LinkedList
{
	public static void test_getNode()
	{
		// getNode
		ListContainer list = new ListContainer();
		
		// 분기 테스트
		// 모든 분기에 들어가는 테스트 코드를 만드는 것
		System.out.println("1. Over & Under Statements");
		
		if (null == list.getNode(-1))
		{
			System.out.println("(1) index < 0 : OK");
		}
		else
		{
			System.out.println("(1) index < 0 : NO");
		}
		
		for (int i = 0; i < 100; i++)
		{
			list.insertNode();
		}
		
		if (null == list.getNode(100))
		{
			System.out.println("(2) index >=count : OK");
		}
		else
		{
			System.out.println("(2) index >=count : NO\n");
		}
		
		System.out.println("2. Over & Under Statements");
		
		// 동등분할 또는 경계값 분석
//		if ((target == head) == list.getNode(49))
//		{
//			
//		}
//		if else (list.getNode(50))
//		{
//			
//		}

		
	}
	
	public static void main(String[] args)
	{
		test_getNode();
	}
}
