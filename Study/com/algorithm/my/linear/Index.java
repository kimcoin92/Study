// 일차 함수 (Linear Function)
// y = ax + b

package com.algorithm.my.linear;

public class Index {

	public static void main(String[] args)
	{
		Linear lf = new Linear(new Position(1,3), new Position(2,5));
		System.out.println(lf.printForm());
	}
}