package com.hash.monitor.teacher;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String _name, int _age)
	{
		name = _name;
		age = _age;
	}

	@Override
	public int compareTo(Person p)
	{
		if (this.age > p.age)
		{
			return -1;
			
		}
		else if (this.age < p.age) 
		{
			return 1;
		}
		else //if (this.age == p.age)
		{
			return 0;
			
		}
		
	}

}
