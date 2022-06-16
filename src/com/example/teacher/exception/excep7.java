package com.example.teacher.exception;

class ClassA
{
	
}

class ClassB extends ClassA
{
	
}

public class excep7 {
	
	public static void main(String[] args)
	{
		ClassA a = new ClassA();
		
		ClassB b = new ClassB();
		
		b = (ClassB) a;
	}
}
