// �н���ǥ : ��ӿ� ���� ���� (��Ȱ��, �Ծ�)

// �䱸����
// - ����ģ�� : �̸�, ����,  ��ȭ��ȣ
// - ���嵿�� : �̸�, �μ���, ��ȭ��ȣ

package com.example.inheritance.teacher.friend;

public class Index {

	public static void main(String[] args) {
		
		Friend[] friend = new Friend[10];
		int count = 0;
		
		friend[count++] = new UnivFriend("�ڻ�*", "��**", "01*-1***-4***");
		friend[count++] = new UnivFriend("�̿�*", "��**", "01*-4***-7***");
		friend[count++] = new UnivFriend("����*", "��**", "01*-0***-3***");
		friend[count++] = new UnivFriend("����*", "��**", "01*-3***-9***");
		friend[count++] = new UnivFriend("����*", "��**", "01*-5***-8***");
		friend[count++] = new CompFriend("�ϼ�*", "��**", "01*-1***-8***");
		friend[count++] = new CompFriend("����*", "��**", "01*-7***-2***");
		friend[count++] = new CompFriend("����*", "��**", "01*-4***-1***");
		friend[count++] = new CompFriend("�ּ�*", "��**", "01*-3***-0***");
		friend[count++] = new CompFriend("����*", "��**", "01*-4***-0***");
		
		for (int i = 0; i < count; i++)
		{
			friend[i].print();
			System.out.println("------------");
		}
	}
}