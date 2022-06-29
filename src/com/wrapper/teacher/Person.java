package com.wrapper.teacher;

public class Person implements Comparable<Object>
{
	private String name;
	private int    age;
	
	public Person(String _name, int _age)
	{
		name = _name;
		age  = _age;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	// int : 두개를 비교하여 1, 0을 기준으로 따진다.
	public int compareTo(Object obj)
	{
		Person p = (Person) obj;
		
		if (this.age > p.age)
		{
			return 1;
		}
		else if (this.age < p.age)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}