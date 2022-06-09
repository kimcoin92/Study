package com.str;

public class Substring {
	
	public static void main(String[] args) {
		
		String a = new String("unhappy");
		
		System.out.println(a.substring(2));
		
		String b = new String("antidisestablishmentarianism");
		
		System.out.println(b.substring(b.indexOf("i"), b.indexOf("m")));

	}

}