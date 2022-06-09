package com.ext;

class Student
{
	private String name;
	private String birth;
	private String gender;
	
	public Student()
	{
		name   = null;
		birth  = null;
		gender = null;
	}
	
	public Student(String _name, String _birth, String _gender)
	{
		name    = _name;
		birth   = _birth;
		gender  = _gender;
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
}

class Middle extends Student
{
	private String  grade;
	private String  year;
	private int[][] score;
	
	public Middle()
	{
		super();
		grade = null;
		year  = null;
		score = null;
	}
	
	public Middle(String _name, String _birth, String _gender, String _grade, String _year)
	{
		super(_name, _birth, _gender);
		grade = _grade;
		year  = _year;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public int[][] getScore()
	{
		return score;
	}
	
	public void setScore(int[][] _score)
	{
		score = _score;
	}
	
	public int[][] getAverage(int[][] _score)
	{
		int[][] result = _score;
		
		return result;
	}
}

class High extends Student
{
	private String  grade;
	private String  year;
	private int[][] score;
	
	public High()
	{
		super();
		grade = null;
		year  = null;
		score = null;
	}
	
	public High(String _name, String _birth, String _gender, String _grade, String _year)
	{
		super(_name, _birth, _gender);
		grade = _grade;
		year  = _year;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public int[][] getScore()
	{
		return score;
	}
	
	public void setScore(int[][] _score)
	{
		score = _score;
	}
	
	public int[][] getAverage(int[][] _score)
	{
		int[][] result = _score;
		
		return result;
	}
}

public class School
{
	
	public static void main(String[] args)
	{
		Middle mstu = new Middle ("Kim", "090101", "man", "1", "2");
		High hstu = new High   ("Han", "091231", "woman", "3", "4");
		
		System.out.println(mstu);
		System.out.println(hstu);
	}
}
