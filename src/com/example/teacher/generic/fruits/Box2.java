//package com.example.teacher.generic.fruits;
//
//public class Box2
//{
//	public static void main(String[] args)
//	{
//		// 첫 Box의 데이터는 String
//		Box <String> sBox = new Box <>();
//		sBox.set("apple");
//		System.out.println(sBox.get());
//		
//		// 1. Box에 Box를 넣어본다.
//		Box<Box<String>> bBox = new Box<>();
//		bBox.set(sBox);
//		
//		System.out.println(bBox.get().get());
//		
//		// 2. Box에 Box에 Box를 넣어본다.
//		Box<Box<Box<String>>> bbBox = new Box<>();
//		bbBox.set(bBox);
//		
//		System.out.println(bbBox.get().get().get());
//	}
//}
