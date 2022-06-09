package com.friend;

public class CompFriend extends Friend {
	
//	private String name;  (상위 클래스에서 존속 상태 : Friend)
	private String department;
//	private String phone; (상위 클래스에서 존속 상태 : Friend)
	
	public CompFriend()
	{
		
	}
	
	public CompFriend(String _name, String _department, String _phone)
	{
//		상위 클래스의 데이터 상속 (Friend)
		super(_name, _phone);
		
//		name  = _name;   (상위 클래스에서 존속 상태 : Friend)
		department = _department;
//		phone = _phone;  (상위 클래스에서 존속 상태 : Friend)
	}
	
	public void print()
	{
//		상위 클래스의 데이터 상속 (Friend.print)
		super.print();
		
//		System.out.println("이름 : " + name);  (상위 클래스에서 존속 상태 : Friend)
		System.out.println("부서 : " + department);
//		System.out.println("번호 : " + phone); (상위 클래스에서 존속 상태 : Friend)
	}
	
	public String toString()
	{

		
//		상위 클래스에서 존속 상태 : Friend
//		return "name = " + name + "department = " + department + " phone = " + phone);
		return super.toString() + "department = " + department;
//		상위 클래스의 데이터 상속 (Friend.toString)
	}
}