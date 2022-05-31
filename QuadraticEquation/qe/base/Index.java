package qe.base;

import qe.system.*;

public class Index
{
	public static void main(String[] args)
	{
		Quadratic qe = new Quadratic(1, -1, -2);
		
		System.out.println(qe.getSolution(true));
		System.out.println(qe.getSolution(false));
	}
}
