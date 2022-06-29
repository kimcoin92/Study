package com.intrface.teacher.hpscanner;

import com.intrface.teacher.msdevice.*;

public class HPscanner implements Scanable {
	
	public boolean initScanner()
	{
		System.out.println("HP-Printer Init");
		
		return true;
	}
	
	public boolean scanDoc(String doc)
	{
		System.out.println("HP-Printer Init : " + doc);
		
		return true;
	}

}
