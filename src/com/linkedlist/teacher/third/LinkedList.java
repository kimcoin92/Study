package com.linkedlist.teacher.third;

public class LinkedList
{
	public static void test_getNode()
	{
		// getNode
		// 분기 테스트
		// 모든 분기에 들어가는 테스트 코드를 만드는 것
		// 동등분할 또는 경계값 분석
		
		ListContainer list = new ListContainer();
		
		for (int i = 0; i < 100000; i++)
		{
			list.insertNode();
		}
	}
	
	public static void main(String[] args)
	{
		test_getNode();
	}
}
