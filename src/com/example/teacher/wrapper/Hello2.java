package com.example.teacher.wrapper;

import java.util.Arrays;

public class Hello2
{
	public static void main(String[] args)
	{
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		// 1. arOrg와 동일한 배열을 만든다.
		double[] arCpy = Arrays.copyOf(arOrg, arOrg.length);
		System.out.println(Arrays.toString(arCpy));
		
		arCpy[0] = 0;
		for (double dd : arOrg)
		{
			System.out.println(dd);
		}
		
		// 2. arOrg의 일부분으로 배열을 만든다.
		// - (index 1부터 index 3의 전까지)
		double[] arCpyPart = Arrays.copyOfRange(arOrg, 1, 3);
		System.out.println(Arrays.toString(arCpyPart));
		
		// 3. 이미 할당된 배열에 외부의 값을 복사한다.
		double[] arr = new double[3];
		
		// arOrg의 index 1부터 arr의 3개의 index로 값을 복사한다.
		System.arraycopy(arOrg, 1, arr, 0, 3);
		System.out.println(Arrays.toString(arr));
		
		// 4. 배열을 비교한다.
		System.out.println(Arrays.equals(arOrg, arCpy));
		
		// 5. 배열 값을 정렬한다.
		int[] ar1 = {43, 2, 0, 4, 5};
		
		Arrays.sort(ar1);
		System.out.println(Arrays.toString(ar1));
		
		// 6. 특정 Object 배열을 정렬한다.
		//  - Compareable interface를 구현한다.
		//  - compareTo() 함수를 구현한다.
		Person[] arPerson = new Person[4];
		
		arPerson[0] = new Person("a", 5);
		arPerson[1] = new Person("b", 8);
		arPerson[2] = new Person("c", 7);
		arPerson[3] = new Person("d", 4);
		
		Arrays.sort(arPerson);
		
		for (Person p : arPerson)
		{
			System.out.println(p);
		}
		
		int idx = Arrays.binarySearch(arPerson, new Person("e", 4));
		
		System.out.println(idx);
	}
}