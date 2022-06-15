// Substring으로 문자열 일부를 추려내기

package com.example.teacher.string;

public class Substring {
	
	public static void main(String[] args) {
		
		String a = new String("unhappy");
		
		System.out.println(a.substring(2));
		
		String b = new String("antidisestablishmentarianism");
		
		System.out.println(b.substring(b.indexOf("i"), b.indexOf("m")));

	}

}