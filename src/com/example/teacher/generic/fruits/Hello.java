package com.example.teacher.generic.fruits;

public class Hello
{
	public static void main(String[] args)
	{
		// Java 8 부터 제네릭 타입 생략이 가능
		Box<Apple> aBox = BoxFactory./* <Apple> */ makeBox(new Apple());
	}
}
