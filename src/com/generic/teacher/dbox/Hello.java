package com.generic.teacher.dbox;

public class Hello
{
	public static void main(String[] args)
	{
		// Left  : String
		// Right : Integer
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		// Right(String)는 AutoBoxing으로 처리된다.
		box.setBox("Apple", 20);
		String str = box.getLeft();
		
		// Integer → int : AutoUnboxing으로 처리된다.
		int i = box.getRight();
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(box);
	}

}
