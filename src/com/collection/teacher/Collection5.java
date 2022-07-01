package com.collection.teacher;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Collection5 {

	public static void main(String[] args) {
		List <String> list = Arrays.asList("A1", "A2", "A3", "A4");		
		list = new ArrayList<>(list);
		
		// 양방향 반복자.
		ListIterator <String> iter = list.listIterator();
		
		String s = null;
		while(iter.hasNext())
		{
			s = iter.next();
			System.out.println(s);
			
			//s가 "A1"이라면 "K1"을 추가한다.
			if (s.equals("A2"))
			{
				iter.add("K1");
				//list.add(s); //ㅇㅔ러발생
			}
			
		}
		
		System.out.println("---------------");
		
		while(iter.hasPrevious())
		{
			s = iter.previous();
			System.out.println(s);
			
			if (s.equals("A3"))
			{
				iter.add("K3");
			}
			
		}
			
		
		System.out.println("---------------");
		
		while(iter.hasNext())
		{
			s = iter.next();
			System.out.println(s);
		}
		
		
		
	}
		

}
