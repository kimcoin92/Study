package com.vend;

interface Orderable
{
//	�ַ� ����ϴ� ��ɵ鸸 ��Ƶδ� ��
	public boolean putMoney(int money);
	public boolean pushButton();
	public int getChange();
}

class VendingMachine implements Orderable
{
	
//	���� �ִ´�.
	public boolean putMoney(int money)
	{
		return true;
	}
	
//	�ݶ� ��ư�� ������.
	public boolean pushButton()
	{
		return true;
	}
	
//	�ܵ��� �޴´�.
	public int getChange()
	{
		return 0;
	}
	
//	�Ŵ����� �θ���.
	public boolean callManager()
	{
		return true;
	}
	
//	��� Ȯ���Ѵ�.
	public int getStock()
	{
		return 100;
	}
}

public class Vending {

	public static void main(String[] args) {
		
//		Orderable interface�� ������
//		"�� VendingMachine�� �����ϴ� �̰�'��' ���ڴ�"
//		"�� : ��Ģ"
		Orderable customer = new VendingMachine();
		
		customer.putMoney(1);

	}

}
