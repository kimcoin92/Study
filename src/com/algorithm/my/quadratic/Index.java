// Quadratic Equation (이차 방정식)
// 근의 공식을 사용

package com.algorithm.my.quadratic;

public class Index
{
	public static void main(String[] args)
	{
		Quadratic qe = new Quadratic(1, -1, -2);
		
		System.out.println(qe.getSolution(true));
		System.out.println(qe.getSolution(false));
	}
}
