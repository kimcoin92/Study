// String의 일반 코드와 슈가 코드의 차이점 비교

package com.example.teacher.string;

public class Equals {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "bc";
		
		if(true == str1.equals(str2))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		String str3 = new String ("def");
		String str4 = new String ("def");
		
		if(true == str3.equals(str4))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		String str5 = new String ("ghi");
		String str6 = new String ("Ghi");
		
		if(true == str5.equalsIgnoreCase(str6))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}

	}

}