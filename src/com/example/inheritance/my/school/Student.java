package com.example.inheritance.my.school;

class Student
{
	public static final int ERROR_INVAILD = -1;
	
	protected String name;
	protected String birth;
	protected String gender;
	
	public Student()
	{
		
	}
	
	public Student(String _name, String _birth, String _gender)
	{
		name    = _name;
		birth   = _birth;
		gender  = _gender;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getBirth()
	{
		return this.birth;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public String toString()
	{
		String str = new String();
		
		str =
				"name   = " + getName()   + "\n" +
				"birth  = " + getBirth()  + "\n" +
				"gender = " + getGender() + "\n";
		
		return str;
	}
}
