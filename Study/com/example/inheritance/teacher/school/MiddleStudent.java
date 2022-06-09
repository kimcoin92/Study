package com.example.inheritance.teacher.school;


public class MiddleStudent extends Student{
	private String group;					//반	
	private MiddleSubjectScore[] score;		// 성적정보
	
	//과목별 학기별 평균점수를 구하는 메소드.
	public float getSubjectAverage(String subject)
	{
		return 0;
	}
	//과목별 평균점수 : 국어 1-1, 1-2, 2-1 2-2 3-1 3-2
	
	//1-1학기 평균점수 : 1-1학기의 (국어+영어+수학+과학) /4 
}



