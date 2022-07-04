package com.collection.teacher;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Collection
{
	public static void main(String[] args)
	{
		// 1. 링크드리스트를 만든다.
		List<String> list1 = new LinkedList<>();
		
		// 2. 리스트에 string데이터를 5개쯤 넣는다.
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		// 3. iterator를 가지고 온다.
		Iterator<String> iter = list1.iterator();
		
		// 4. iterator로 데이터를 순회하면서 찍어본다.
		
		System.out.println("while문");
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("-------");
		
		// 5. enhanced-for문으로 순회하면서 찍어본다.
		
		System.out.println("enhanced-for문");
		
		for (String str2 : list1)
		{
			System.out.println(str2);
		}
		
		System.out.println("-------");
		
		// 6. 일반 for문으로 순회하면서 찍어본다.
		
		System.out.println("for문");
		
		for (int i = 0; i < list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println("-------");
		
		System.out.println("알렉산더 스테파노프형 for문");
		
		for (iter = list1.iterator(); true == iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
}