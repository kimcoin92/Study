package com.example.teacher.generic.fruits;

public class Hello
{
	public static void main(String[] args)
	{
		/*
		Box box = new Box();
		Apple a1 = new Apple();
		
		// 유연성을 극대화한 코딩의 문제점
		// Box의 데이터 타입이 Object이기 때문에 다목적, 문제 찾기가 힘들다.
		box.set(a1);
		
		// 컴파일러가 알려주지 못하는 문제
		box.set("I am an Apple.");
		
		// 불필요한 형변환이 발생한다.
		Apple a  = (Apple) box.get();
		
		// 사용자의 실수를
		// 1. 컴파일 시점에 알려주는게 가장 좋다.
		// 2. 런타임 시점에서 예외로서 알려주는게 좋다.
		// 3. (최악) 컴파일러가 찾지 못하는 경우
		*/
		
		Box <Apple> appleBox = new Box <Apple> ();
		Box <Orange> orangeBox = new Box <Orange> ();
		
		appleBox.set(new Apple());
		
		// 컴파일러가 제한
		// appleBox.set(new Orange());
		
		Apple apple1 = appleBox.get();
		
		System.out.println(apple1);
	}
}
