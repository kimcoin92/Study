package com.str;

public class Equals {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "bc";
		
		if(true == str1.equals(str2))
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");
		}
		
		String str3 = new String ("def");
		String str4 = new String ("def");
		
		if(true == str3.equals(str4))
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");
		}
		
		String str5 = new String ("ghi");
		String str6 = new String ("Ghi");
		
		if(true == str5.equalsIgnoreCase(str6))
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");
		}

	}

}