package com.friend;

public class Friend {
//	��Ӱ���
//	�θ� : Friend
//	�ڽ� : UnivFriend
//	�ڽ� : CompFriend
	
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
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
	}
	
	public String toString()
	{
		String str = new String("name = " + name + " phone = " + phone);
		
		return str;
	}
}
