package com.example.inheritance.teacher.friend;

public class UnivFriend extends Friend {
	
//	private String name;  (���� Ŭ�������� ���� ���� : Friend)
	private String major;
//	private String phone; (���� Ŭ�������� ���� ���� : Friend)
	
	public UnivFriend()
	{
		
	}
	
	public UnivFriend(String _name, String _major, String _phone)
	{
//		���� Ŭ������ ������ ��� (Friend)
		super(_name, _phone);
		
//		name  = _name;   (���� Ŭ�������� ���� ���� : Friend)
		major = _major;
//		phone = _phone;  (���� Ŭ�������� ���� ���� : Friend)
	}
	
	public void print()
	{
//		���� Ŭ������ ������ ��� (Friend.print)
		super.print();
		
//		System.out.println("�̸� : " + name);  (���� Ŭ�������� ���� ���� : Friend)
		System.out.println("���� : " + major);
//		System.out.println("��ȣ : " + phone); (���� Ŭ�������� ���� ���� : Friend)

	}
	
	public String toString()
	{

		
//		���� Ŭ�������� ���� ���� : Friend
//		return "name = " + name + "major = " + major + " phone = " + phone);
		return super.toString() + "major = " + major;
//		���� Ŭ������ ������ ��� (Friend.toString)
	}
}