// String 선언의 일반코드와 슈가코드의 차이점

package com.example.string;

public class Sugar {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		
		if(str1 == str2)
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		String str3 = new String ("def");
		String str4 = new String ("def");
		
		if(str3 == str4)
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}

	}

}