package com.collection.teacher;

import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.LinkedList;

public class Collection4
{
	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("1", "2", "3", "4");
		list1 = new LinkedList<>(list1);
		
		// 양방향 반복자
		ListIterator<String> iter = list1.listIterator();
		
		String str1 = null;
		
		while(iter.hasNext())
		{
			str1 = iter.next();
			
			if(str1.equals("3"))
			{
				// list1.add("6"); 이미 순회된 배열 위치에 다시 간다는 것은 불가능
				iter.add("6");
				// iter가 추가할수있는 위치에 새로 추가.
				// 이미 순회된 배열보다 순회 예정인 방향이 효율적이라 판단.
				// next는 앞부분, previous뒷부분
			}
			System.out.println(str1);
		}
		
		while(iter.hasPrevious())
		{
			if(str1.equals("3"))
			{
				iter.add("6");
			}
		}
	}
}