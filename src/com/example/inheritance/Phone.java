package com.example.inheritance;

class MobilePhone
{
	public void call()
	{
		System.out.println("Call 119");
	}
}

class SmartPhone extends MobilePhone
{
	public void call()
	{
		System.out.println("Call");
	}

public class ExtendExample2 {
	
	public static void main(String[] args) {
		
		MobilePhone phone1 = new MobilePhone();
		MobilePhone phone2 = new SmartPhone();
		
		phone1.call();
		phone2.call();
		
	}
}

}