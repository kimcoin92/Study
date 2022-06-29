package com.generic.teacher.restrict;

// Number나 Number로부터 상속받은 요소를 사용할때 extends
public class Box <T> {

	protected T obj;
	
	public Box()
	{
		
	}
	
	public Box(T _obj)
	{
		obj = _obj;
	}
	
	public void set(T _obj)
	{
		obj = _obj;
	}
	
	public T get(T _obj)
	{
		return _obj;
	}

	@Override
	public String toString() {
		return "Box [obj=" + obj + "]";
	}
}