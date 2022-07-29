package com.main.collection.number;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Collection3
{
	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("1", "2", "3");
		list1 = new ArrayList<>(list1);
		list1 = new LinkedList<>(list1);
		list1 = new ArrayList<>(list1);
		
		for (String str1 : list1)
		{
			System.out.println(str1);
		}
	}
}