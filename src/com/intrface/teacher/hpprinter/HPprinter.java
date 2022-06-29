package com.intrface.teacher.hpprinter;

import com.intrface.teacher.hpscanner.*;
import com.intrface.teacher.msdevice.*;

// Printable을 이어받은 ColorPrintable을 상속받아 사용
// implements에 Buzzer라는 빈 메서드를 보고 이런 기능이 있다는 것을 인지하게 하는 테크닉 : Marker Interface
public class HPprinter extends HPscanner implements ColorPrintable, Scanable, Buzzer
{
	@Override
	public boolean initPrinter()
	{
		System.out.println("HP-Printer Init");
		
		return true;
	}
	
	@Override
	public boolean printDoc(String doc)
	{
		System.out.println("HP-Printer Init : " + doc);
		
		return true;
	}
	
	@Override
	public boolean printColorDoc(String doc)
	{
		System.out.println("HP-Color Printer Init : " + doc);
		
		return true;
	}
}
