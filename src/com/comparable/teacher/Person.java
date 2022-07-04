package com.comparable.teacher;

public class Person implements Comparable<Person>
{
	private String name;
	private int    age;
	
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


	@Override
	public int compareTo(Person p)
	{
		int result = 0;
		
		if(this.age > p.age)
		{
			result = 1;
		}
		else if(this.age < p.age)
		{
			result = -1;
		}
		else // if(this.age == p.age)
		{
			result = 0;
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
