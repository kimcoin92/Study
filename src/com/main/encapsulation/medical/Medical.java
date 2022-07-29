package com.main.encapsulation.medical;

class ThroatPill
{
	public void take()
	{
		System.out.println("Dextromethorphan 20mg");
	}
}

class NosePill
{
	public void take()
	{
		System.out.println("chlorpheniramine maleate 4mg");
	}
}

class FeverPill
{
	public void take()
	{
		System.out.println("Ibuprofen 800mg");
	}
}

// 캡슐화
public class Medical
{
	private void InjectThroth()
	{
		ThroatPill throat = new ThroatPill();
		throat.take();
	}
	
	private void InjectNose()
	{
		NosePill nose     = new NosePill();
		nose.take();
	}
	
	private void InjectFever()
	{
		FeverPill fever   = new FeverPill();
		fever.take();
	}
	
	public void take()
	{
		InjectThroth();
		InjectNose();
		InjectFever();
	}
}