package com.comparable.person;

public class Person implements Comparable<Person>
{
	// ## 내 코드 ##
	
	private String name;
	private int    age;
	private int    strLength;
	
	public Person(String _name, int _age)
	{
		name = _name;
		age  = _age;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getLength()
	{
		return name.length();
	}

	/*
	
	@Override
	// 내림차순 정렬
	public int compareTo(Person p)
	{
		int result = 0;
		
		if(this.age > p.age)
		{
			result = -1;
		}
		else if(this.age < p.age)
		{
			result = 1;
		}
		else // if(this.age == p.age)
		{
			result = 0;
		}
		
		return result;
	}
	
	*/
	
	// Person : compareTo
	// 이름의 길이를 기준으로 오름차순
	@Override
	public int compareTo(Person p)
	{
		int result = 0;
		strLength = getLength();
		
		if(this.strLength > p.strLength)
		{
			result = 1;
		}
		else if(this.strLength < p.strLength)
		{
			result = -1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Person [name: " + name + ", age: " + age + "]";
	}
	
	
	// ## 정성훈 강사님의 코드 ##
	
	/*
	// 오름차순 정렬
	// Person을 비교하는 정렬 기준 메서드를 Person class 안에 있다.
	// 자기가 정렬되어야 하는 기준을 내부에 가지고 있는 코드는 이상한 코드이다.
	// 정렬 기준은 외부에서 설정되어야 한다.
	// to PersonComparator →
	
	@Override
	public int compareTo(Person p)
	{
		return this.age - p.age;
	}
	*/
}