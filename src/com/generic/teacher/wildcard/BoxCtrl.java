package com.generic.teacher.wildcard;

public class BoxCtrl
{
	public static <T> T openBox(Box<T> box)
	{
		return box.get();
	}
	
	// Run-time에 정해지는 Datatype을 제한하여 안정성 향상이 목적이다.
	
	
	// 1번 : 기존의 제네릭 코드를 이용하는 방법 → 상한으로 제한
	public static <T extends Number> void printBox1(Box<T> box)
	{
		System.out.println(box);
	}
	
	
	// 2번 : 새로운 문법인 Wildcards를 이용하는 방법
	
	// 상한으로 제한 "뭐가 와도 좋은데 String만 와라"
	public static void printBox2(Box<? extends Number> box)
	{
		System.out.println(box);
	}
	
	// 하한으로 제한
	// super Number → 밑바닥인 Integer인 클래스를 지정

	public static void printBox3(Box<? super Number> box)
	{
		System.out.println(box);
	}
	
	// 1번 & 2번은 원리가 동일하다.. (자바/논란)
	
	// 3번 : 클래스명을 고정으로 만드는 방법 (강력한 방법 → 잘 안씀)
	public static void printBox4(Box<String> box)
	{
		System.out.println(box);
	}
	
//	########################################################
	
//	extends와 super의 차이
	
	public static void printBox5(Box<? extends Number> box)
	{
//		Number num1 = box.get();
//		box.set(1); (Error)
	}
	
//	하한의 의미
//	Number의 윗대가리(;;) (Object같은..)
//	Number가 오던지 Number보다 작은, 즉 넘버의 상위 클래스 인스턴스가 온다.
//	크기의 의미 : Object < Number (Object + Number-Only)
	public static void printBox6(Box<? super Number> box)
	{
		// Number의 "참조변수"를 받았기 때문에 오류
//		Number num2 = box.get(); // Object instance (Error)
		box.set(1);
		// Integer 박스로 
		// 큰 참조변수 = 작은 인스턴스
	}

}