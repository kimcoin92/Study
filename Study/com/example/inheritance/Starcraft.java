package com.example.inheritance;

class Unit
{
	public int state = 0;
	public void run(int speed)
	{
		if(state == 1)
			System.out.printf("hydra run %d \n", speed - 1);
		else
			System.out.printf("hydra run %d \n", speed);
	}
}
class Hydra extends Unit
{
	public void run(int speed)
	{
		System.out.printf("hydra run %d \n", speed);
	}
}
class Ultra extends Unit
{
	public void run(int speed)
	{
		System.out.printf("ultra run %d \n", speed);
	}
}
public class Starcraft {
	public static void main(String[] args) {
		Unit[] ar = new Unit[4];
		ar[0] = new Hydra();
		ar[1] = new Hydra();
		ar[2] = new Ultra();
		ar[3] = new Ultra();
		ar[0].state = 1;
		ar[1].state = 1;
		ar[2].state = 1;
		ar[3].state = 1;
		for(int i = 0; i < ar.length; i++)
			ar[i].run(4);
	}
}
