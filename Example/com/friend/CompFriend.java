package com.friend;

public class CompFriend extends Friend {
	
//	private String name;  (���� Ŭ�������� ���� ���� : Friend)
	private String department;
//	private String phone; (���� Ŭ�������� ���� ���� : Friend)
	
	public CompFriend()
	{
		
	}
	
	public CompFriend(String _name, String _department, String _phone)
	{
//		���� Ŭ������ ������ ��� (Friend)
		super(_name, _phone);
		
//		name  = _name;   (���� Ŭ�������� ���� ���� : Friend)
		department = _department;
//		phone = _phone;  (���� Ŭ�������� ���� ���� : Friend)
	}
	
	public void print()
	{
//		���� Ŭ������ ������ ��� (Friend.print)
		super.print();
		
//		System.out.println("�̸� : " + name);  (���� Ŭ�������� ���� ���� : Friend)
		System.out.println("�μ� : " + department);
//		System.out.println("��ȣ : " + phone); (���� Ŭ�������� ���� ���� : Friend)
	}
	
	public String toString()
	{

		
//		���� Ŭ�������� ���� ���� : Friend
//		return "name = " + name + "department = " + department + " phone = " + phone);
		return super.toString() + "department = " + department;
//		���� Ŭ������ ������ ��� (Friend.toString)
	}
}