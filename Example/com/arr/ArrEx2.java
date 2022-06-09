package com.arr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrEx2 {

	public static void main(String[] args) {
		
		ArrEx2 object = new ArrEx2();
		int[][] result = new int[2][2];
		
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		
//		1. ����ڷκ��� 2 x 2 ����� �Է¹޴´�.
		
		Scanner input = new Scanner(System.in);
		
		String inputString;
		
		System.out.println("ù��° ����� �Է����ּ���");
		inputString = input.nextLine();
		
		String[] str = inputString.split(" ");
		
		a[0][0] = Integer.parseInt(str[0]);
		a[0][1] = Integer.parseInt(str[1]);
		a[1][0] = Integer.parseInt(str[2]);
		a[1][1] = Integer.parseInt(str[3]);
		
		System.out.println("�ι�° ����� �Է����ּ���");
		inputString = input.nextLine();
		
		str = inputString.split(" ");
		
		b[0][0] = Integer.parseInt(str[0]);
		b[0][1] = Integer.parseInt(str[1]);
		b[1][0] = Integer.parseInt(str[2]);
		b[1][1] = Integer.parseInt(str[3]);
		
//		2. ������ ���� �����ϵ���
		
		System.out.println("���ϱ�, ���� ���� (+,-)");
		inputString = input.nextLine();
		
		input.close();
		
//		3. ���
		
		result = object.proCal(a, b, inputString);
		
//		4. ����� ���
		
		System.out.println(object.getPrint(result));
		
	}
	
	public static final int[][] ERROR_INVAILD = null;
	
	public int[][] proCal(int[][] arr1, int[][] arr2, String sign)
	{
		int[][] total = new int[arr1.length][arr1[0].length];
		
		if (sign.equals("+") == true)
		{
			for(int i = 0; i < total.length; i++)
			{
				for(int k = 0; k < total.length; k++)
				{
					total[i][k] = arr1[i][k] + arr2[i][k];
				}
			}
		}
		else if (sign.equals("-") == true)
		{
			for(int i = 0; i < total.length; i++)
			{
				for(int k = 0; k < total.length; k++)
				{
					total[i][k] = arr1[i][k] - arr2[i][k];
				}
			}
		}
		else
		{
			total = ERROR_INVAILD;
		}
		
		return total;
		
//		����
//		val, kal�� ���ϴ� �κп��� ����
//		
//		The operator + is undefined for the argument type(s) int[], int[])
//		
//		for(int[] val : arr1)
//		{
//			for(int[] kal : arr2)
//			{
//				total[idx1][idx2] = val + kal;
//				
//				idx2++;
//			}
//			idx1++;
		}
		
//		return total;
//	}
//	
	public String getPrint(int[][] array)
	{
		String result = new String();
		
		if (array != ERROR_INVAILD)
		{
			result = Arrays.toString(array[0]) + Arrays.toString(array[1]);
		}
		else
		{
			result = "�߸��� ���Դϴ�.";
		}
		
		return result;
	}
}
