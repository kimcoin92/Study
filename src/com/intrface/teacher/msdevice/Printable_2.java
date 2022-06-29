package com.intrface.teacher.msdevice;
// 추상 클래스의 목적

// 예)
// 나는 Printable class의 인스턴스를 직접 만들고 싶지 않다.
// 즉, Printable class는 상속받아서 사용하기를 원한다.
// 왜냐면 일반 기능 (Print) 외에 컬러 프린트 기능을 각 다른 방식 (RGB, CMYK 등)으로 사용한다면
// 색깔 종류에 맞는 팔레트를 각자의 회사가 구현 해주기를 바란다면 "재정의"해서 직접 구현하도록 유도하는 시스템이 필요하다.
// 결론적으로 상속받아서 사용하는 class에서 "반드시 구현"해야 하는 메소드가 있다는 것을 전달해주고 싶다.
// 이러한 개념을 class로써 만들고 싶다.
public abstract class Printable_2
{
	
	protected boolean initPrinter()
	{
		System.out.println("HP-Printer Init");
		
		return true;
	}
	
	protected boolean printDoc(String doc)
	{
		System.out.println("HP-Printer Init : " + doc);
		
		return true;
	}
	
	// 회사 각자가 직접 구현해서 사용하라는 의미를 보여주도록 하는 것이 목적
	protected abstract boolean printColorDoc(String doc, int[] palette);
}
