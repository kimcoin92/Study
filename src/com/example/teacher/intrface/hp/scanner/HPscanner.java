package com.example.teacher.intrface.hp.scanner;

import com.example.teacher.intrface.ms.*;

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
