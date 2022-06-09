package com.ext;

class Animal
{
	public Animal()
	{
	}
}

class Dog extends Animal
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

public class ExtendExample1 {

	public static void main(String[] args) {
		
		Dog kenny = new Dog();
		
		System.out.println(kenny);
	}

}
