package com.inheritance.animal;

public class Dog extends Animal
{
	public Dog()
	{
		
	}
	
	public Dog(int a)
	{
		super();
	}
	
	public void eat(String item)
	{
		System.out.printf("Eat %s \n", item);
	}
}