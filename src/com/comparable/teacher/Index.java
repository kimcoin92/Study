package com.comparable.teacher;

import java.util.TreeSet;

public class Index
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		TreeSet<Person> pSet = new TreeSet<>();
		
		boolean res = false;
		
		res = pSet.add(new Person("Kim", 48));
		res = pSet.add(new Person("Amy", 34));
		res = pSet.add(new Person("Max", 52));
		res = pSet.add(new Person("Tom", 40));
		
		System.out.println(pSet);
	}
}
