package com.hash.monitor.teacher;

import java.util.HashSet;
import java.util.Iterator;

public class Index
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		HashSet<Monitor> mSet = new HashSet<>();
		
		boolean res = false;
		
		res = mSet.add(new Monitor("SS-01", "BLACK"));
		res = mSet.add(new Monitor("SS-01", "WHITE"));
		res = mSet.add(new Monitor("SS-02", "BLACK"));
		res = mSet.add(new Monitor("SS-02", "WHITE"));
		res = mSet.add(new Monitor("SS-03", "BLACK"));
		res = mSet.add(new Monitor("SS-03", "WHITE"));
		
		res = mSet.add(new Monitor("SS-01", "BLACK")); // 안들어간다.
		res = mSet.add(new Monitor("SS-02", "WHITE")); // 안들어간다.
		
		for(Monitor m : mSet)
		{
			System.out.printf("MODEL = %s, COLOR = %s\n", m.getModel(), m.getColor());
		}
	}
}