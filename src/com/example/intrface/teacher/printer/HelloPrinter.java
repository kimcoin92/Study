package com.example.intrface.teacher.printer;

import com.example.intrface.teacher.ms.*;
import com.example.intrface.teacher.hp.printer.*;
import com.example.intrface.teacher.hp.scanner.*;
import com.example.intrface.teacher.lg.printer.*;

public class HelloPrinter {

	public static void main(String[] args) {
		
		Printable prn1 = new HPprinter();
		Printable prn2 = new LGprinter();
		
		Scanable scn1 = new HPscanner();
		
		System.out.println(Printable.HP_ID);
		prn1.initPrinter();
		prn1.printDoc("abc");
		
		System.out.println(Printable.LG_ID);
		prn2.initPrinter();
		prn2.printDoc("abc");
		
		scn1.initScanner();
		scn1.scanDoc("cde");
		
		// instanceof의 전반적인 의도
		// 해석 1 : prn2가 Printable의 인스턴스인가?
		// 해석 2 : prn2가 프린트 가능하냐?
		if (true == (prn2 instanceof LGprinter))
		{
			System.out.println("Confirmed LG Printer");
		}
		
		if (true == (prn2 instanceof Printable))
		{
			System.out.println("Confirmed LG Printer");
		}
		
		boolean result = false;
		
		result = prn1.printDoc("abc");
				
		// instanceof의 전반적인 의도
		// 단순한 정보의 전달의 목적
		// Marker Interface
		if (result == false)
		{
			if (prn1 instanceof Buzzer)
			{
				
			}
			else
			{
				
			}
		}
		
		// 추상 클래스 예시
		// 직접적인 인스턴스는 불가
		HPprinterM1 prn4 = new HPprinterM1();
		
		prn4.printColorDoc(null, null);
	}
}