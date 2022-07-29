package com.comparable.person;

import java.util.Comparator;



public class PersonComparator implements Comparator<Person>
{
	// 1. 내 코드
	
	// PersonComparator : compare
	// 이름의 길이를 기준으로 내림차순
	public int compare(Person p1, Person p2)
	{
		return p2.getLength() - p1.getLength();
	}
	
	// 2. 정성훈 강사님의 코드
	
	/*
	// (1) 오름차순 정렬
	// 
	// Person과 PersonComparator는 서로 다른 클래스이기 때문에 this가 들어갈 수 없다.
	// Person에 대한 정렬 기준을 설정한 상황이다.
	// TreeSet이 사용한다.
	
	// → from Person
	public int compare(Person p1, Person p2)
	{
		return p2.getAge() - p1.getAge();
	}
	
	*/
}