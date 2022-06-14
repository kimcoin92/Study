package com.example.intrface.teacher.hp.scanner;

import com.example.intrface.teacher.ms.*;

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
