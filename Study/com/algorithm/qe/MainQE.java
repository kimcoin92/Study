// Quadratic Equation

package com.algorithm.qe;

public class MainQE
{
	public static void main(String[] args)
	{
		AlgoQE qe = new AlgoQE(1, -1, -2);
		
		System.out.println(qe.getSolution(true));
		System.out.println(qe.getSolution(false));
	}
}
