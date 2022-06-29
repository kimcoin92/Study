package com.exception.teacher;

class ClassA

{
	
}

class ClassB extends ClassA
{
	
}

public class ClassCast {
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
		ClassA a = new ClassA();
		
		ClassB b = new ClassB();
		
		b = (ClassB) a;
	}
}
