// �����Լ� ��� ����
// 2. ���� Ŭ����

// ������ ����� ���� �� Ŭ����
package com.base;

import com.system.*;

public class Index {

	public static void main(String[] args)
	{
		// �ǹ��� : ������ ���� new�� �߰��� ����, ������ "undefined for the type" ���� �߻�
		Function lf = new Function(new Position(1,3), new Position(2,5));
		
		System.out.println(lf.printForm());
	}
}