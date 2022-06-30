package com.collection.teacher;

import java.util.List;
import java.util.Arrays;

public class Collection2
{
	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("1", "2", "3");
		
		System.out.println("----------");
		
		for (String str1 : list1)
		{
			System.out.println(str1);
		}
		
		System.out.println("----------");
		
		list1.set(1, "4");
		
		for (String str1 : list1)
		{
			System.out.println(str1);
		}
		
		System.out.println("----------");
		
		list1.add("5");
		
		for (String str1 : list1)
		{
			System.out.println(str1);
		}
	}
}