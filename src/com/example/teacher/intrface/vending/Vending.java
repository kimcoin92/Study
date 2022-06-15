// 자판기 비유를 통한 interface 기능 예시

package com.example.teacher.intrface.vending;

interface Orderable
{
//	주로 사용하는 기능들만 모아두는 것
	public boolean putMoney(int money);
	public boolean pushButton();
	public int getChange();
}

class VendingMachine implements Orderable
{
	
//	돈을 넣는다.
	public boolean putMoney(int money)
	{
		return true;
	}
	
//	콜라 버튼을 누른다.
	public boolean pushButton()
	{
		return true;
	}
	
//	잔돈을 받는다.
	public int getChange()
	{
		return 0;
	}
	
//	매니저를 부른다.
	public boolean callManager()
	{
		return true;
	}
	
//	재고를 확인한다.
	public int getStock()
	{
		return 100;
	}
}

public class Vending {

	public static void main(String[] args) {
		
//		Orderable interface의 참조형
//		"난 VendingMachine이 제공하는 이것'만' 쓰겠다"
//		"만 : 규칙"
		Orderable customer = new VendingMachine();
		
		customer.putMoney(1);

	}

}
