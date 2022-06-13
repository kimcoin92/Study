package com.example.inheritance.teacher.friend;

public class Friend {
//	상속관계
//	부모 : Friend
//	자식 : UnivFriend
//	자식 : CompFriend
	
	protected String name;
	protected String phone;
	
	public Friend()
	{
		
	}
	
	public void setPhone(String _phone)
	{
		phone = _phone;
	}
	
	public String getPhone()
	{
		return this.phone;
	}
	
	public Friend(String _name, String _phone)
	{
		name  = _name;
		phone = _phone;
	}
	
	public void print()
	{
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
	}
	
	public String toString()
	{
		String str = new String("name = " + name + " phone = " + phone);
		
		return str;
	}
}
