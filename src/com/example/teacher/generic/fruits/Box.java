package com.example.teacher.generic.fruits;

// Box 클래스가 아니라 Box<T> 클래스
// 실행시간에 정해지는 타입 <T>를 가지고 있는 클래스
// Run-time에 T가 정해지는 Box 클래스
public class Box <T> {
	
	// 실행시간에 정해지는 데이터타입
	// Run-time에 클래스가 인스턴스화 될 때, 데이터타입을 정해준다.
	protected T obj;
	
	public Box()
	{
		
	}
	
	public Box(T _obj)
	{
		obj = _obj;
	}
	
	public void set(T _obj)
	{
		obj = _obj;
	}

	public T get()
	{
		return obj;
	}
	
	public static void main(String[] args)
	{
		// 첫 Box의 데이터는 String
		Box <String> sBox = new Box <>();
		sBox.set("apple");
		System.out.println(sBox.get());
		
		// 1. Box에 Box를 넣어본다.
		Box<Box<String>> bBox = new Box<>();
		bBox.set(sBox);
		
		System.out.println(bBox.get().get());
		
		// 2. Box에 Box에 Box를 넣어본다.
		Box<Box<Box<String>>> bbBox = new Box<>();
		bbBox.set(bBox);
		
		System.out.println(bbBox.get().get().get());
	}
}