package com.example.inheritance.teacher.friend;

public class UnivFriend extends Friend {
	
//	private String name;  (상위 클래스에서 존속 상태 : Friend)
	private String major;
//	private String phone; (상위 클래스에서 존속 상태 : Friend)
	
	public UnivFriend()
	{
		
	}
	
	public UnivFriend(String _name, String _major, String _phone)
	{
//		상위 클래스의 데이터 상속 (Friend)
		super(_name, _phone);
		
//		name  = _name;   (상위 클래스에서 존속 상태 : Friend)
		major = _major;
//		phone = _phone;  (상위 클래스에서 존속 상태 : Friend)
	}
	
	public void print()
	{
//		상위 클래스의 데이터 상속 (Friend.print)
		super.print();
		
//		System.out.println("이름 : " + name);  (상위 클래스에서 존속 상태 : Friend)
		System.out.println("전공 : " + major);
//		System.out.println("번호 : " + phone); (상위 클래스에서 존속 상태 : Friend)

	}
	
	public String toString()
	{

		
//		상위 클래스에서 존속 상태 : Friend
//		return "name = " + name + "major = " + major + " phone = " + phone);
		return super.toString() + "major = " + major;
//		상위 클래스의 데이터 상속 (Friend.toString)
	}
}