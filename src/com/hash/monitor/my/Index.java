package com.hash.monitor.my;

import java.util.HashSet;
import java.util.Iterator;


public class Index
{
	public static void main(String[] args)
	{
		HashSet<Monitor> customer = new HashSet<>();
		
		boolean isEqual;
		
		isEqual = customer.add(new Monitor("Samsung", 1));
		System.out.println(isEqual);
		
		isEqual = customer.add(new Monitor("Samsung", 2));
		System.out.println(isEqual);
		
		isEqual = customer.add(new Monitor("Samsung", 3));
		System.out.println(isEqual);
		
		isEqual = customer.add(new Monitor("Samsung", 4));
		System.out.println(isEqual);
		
		isEqual = customer.add(new Monitor("Samsung", 5));
		System.out.println(isEqual);
		
		// 중복 색상
		isEqual =  customer.add(new Monitor("Samsung", 1));
		System.out.println(isEqual);
		
		isEqual =  customer.add(new Monitor("Samsung", 2));
		System.out.println(isEqual);
		
		Iterator<Monitor> iter = customer.iterator();
		
		Monitor iterVal;
		
		while (iter.hasNext())
		{
			iterVal = iter.next();
			
			System.out.println(iterVal);
		}
	}
}