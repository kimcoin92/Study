package com.intrface.teacher.hpprinter;

import com.intrface.teacher.msdevice.Printable_2;

// 추상 클래스 예시
// Printable_2로부터 "반드시 구현"하라는 상속을 받은 상태
public class HPprinterM1 extends Printable_2
{
	public boolean printColorDoc(String doc, int[] palette)
	{
		System.out.println("Init Printer");
		
		return true;
	}
}