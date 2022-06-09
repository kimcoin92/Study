package com.example.inheritance.teacher.school;

public class Student 
{
	protected String name;		// 이름, 
	protected String birth;		// 생년월일 
	protected String gender;	// 성별
	protected int  	 grade;		// 학년
	
	//생성자
	public Student()
	{
		
	}
		
	public Student(String _name, String _birth, String _gender, int _grade)
	{
		this.name 	= _name; 
		this.birth 	= _birth; 
		this.gender = _gender;
		this.grade	= _grade;
		
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getBirth() 
	{
		return birth;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public int getGrade() 
	{
		return grade;
	}

	public void setName(String _name) 
	{
		this.name = _name;
	}

	public void setBirth(String _birth) 
	{
		this.birth = _birth;
	}

	public void setGender(String _gender)
	{
		this.gender = _gender;
	}

	public void setGrade(int _grade) 
	{
		this.grade = _grade;
	}
	
	
}
