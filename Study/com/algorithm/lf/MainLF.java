// �����Լ� ��� ����
// 2. ���� Ŭ����

// ������ ����� ���� �� Ŭ����
package com.algorithm.lf;

public class MainLF {

	public static void main(String[] args)
	{
		// �ǹ��� : ������ ���� new�� �߰��� ����, ������ "undefined for the type" ���� �߻�
		AlgoLF lf = new AlgoLF(new PosLF(1,3), new PosLF(2,5));
		
		System.out.println(lf.printForm());
	}
}