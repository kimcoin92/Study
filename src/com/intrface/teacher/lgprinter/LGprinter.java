package com.intrface.teacher.lgprinter;

import com.intrface.teacher.msdevice.Printable;

// Printable의 통일 interface를 받아 구체적인 작동 로직을 구현
public class LGprinter implements Printable {
	
	@Override
	public boolean initPrinter()
	{
		System.out.println("LG-Printer Init");
		
		return true;
	}
	
	@Override
	public boolean printDoc(String doc)
	{
		System.out.println("LG-Printer Init : " + doc);
		
		return true;
	}
}
