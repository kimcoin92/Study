// �����Լ� ��� ����
// 2. ���� Ŭ����

// ������ ����� ���� �� Ŭ����
package lf.base;

import lf.system.*;

public class Index {

	public static void main(String[] args)
	{
		// �ǹ��� : ������ ���� new�� �߰��� ����, ������ "undefined for the type" ���� �߻�
		Linear lf = new Linear(new Position(1,3), new Position(2,5));
		
		System.out.println(lf.printForm());
	}
}