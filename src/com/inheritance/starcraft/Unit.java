package com.inheritance.starcraft;

public class Unit
{
	public int state = 0;
	public void run(int speed)
	{
		if(state == 1)
		{
			System.out.printf("hydra run %d \n", speed - 1);
		}
		else
		{
			System.out.printf("hydra run %d \n", speed);
		}
	}
}