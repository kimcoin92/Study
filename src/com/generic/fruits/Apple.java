package com.generic.fruits;

public class Apple implements Eatable {
	
//	@Override
//	public String toString()
//	{
//		return "I am an Apple.";
//	}
	
	public String eat()
	{
		return "It tastes so good!";
	}
	
	public static void main(String[] args)
	{
		// Java 8 부터 제네릭 타입 생략이 가능
//		Box<Apple> aBox = BoxFactory./* <Apple> */ makeBox(new Apple());
	
		// 이 시점에서 데이터타입을 결정해줘야 한다.
//		Box<T> box = new Box<>();
		
		SingleBox<Apple> box = new SingleBox<>();
		
		System.out.println(box.get(null));
	}
}
