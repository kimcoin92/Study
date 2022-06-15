package com.example.teacher.inheritance.school;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] student = new Student[5];
		
		// 중학생 인스턴스를 생성
		student[0] = new MiddleStudent("1");
		
		student[0].setStudent("Kim", "19901010", "male", 1);
		
		student[0].setScore("1-1", 80, 90, 70, 60);
		student[0].setScore("1-2", 70, 81, 71, 61);
		student[0].setScore("2-1", 50, 92, 72, 62);
		student[0].setScore("2-2", 40, 83, 73, 63);
		student[0].setScore("3-1", 30, 94, 74, 64);
		student[0].setScore("3-2", 20, 95, 75, 65);
		
//		float avg;
//		avg = student[0].getSubjectAverage("kor");
//		
//		System.out.printf("전학기 국어 평균 = %.2f \n " ,avg);

	}

}
