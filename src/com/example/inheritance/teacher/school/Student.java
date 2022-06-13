package com.example.inheritance.teacher.school;

public class Student 
{
	protected String name;		// 이름, 
	protected String birth;		// 생년월일 
	protected String gender;	// 성별
	protected int  	 grade;		// 학년
	
	public static int getTermIndex(String _term)
	{
		int term_index = 0;
		
		switch(_term)
		{
		case "1-1" :
			term_index = 0;
		break;
		
		case "1-2" :
			term_index = 1;
		break;
		
		case "2-1" :
			term_index = 2;
		break;
		
		case "2-2" :
			term_index = 3;
		break;
		
		case "3-1" :
			term_index = 4;
		break;
		
		case "3-2" :
			term_index = 5;
		break;
		
		default :
			term_index = -1;
			break;
		}
		return term_index;
	}
	
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
	
	public void setStudent(String _name, String _birth, String _gender, int _grade)
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
	
	// Student를 통해서 MiddleStudent로 접근하기 위한 interface 역할
	public boolean setScore(String _term, int _kor, int _eng, int _mth, int _sci) 
	{
			return false;
	}
	
//	public float getSubjectAverage(String _subject)
//	{
//		return total / TERM_COUNT;
//	}
	
}
