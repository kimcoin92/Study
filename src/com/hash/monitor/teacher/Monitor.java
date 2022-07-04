package com.hash.monitor.teacher;

public class Monitor
{
	private String model;
	private String color;
	
	public Monitor()
	{
		
	}
	
	public Monitor(String _model, String _color)
	{
		model = _model;
		color = _color;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String _model)
	{
		model = _model;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String _color)
	{
		color = _color;
	}
	
	@Override
	public boolean equals(Object _obj)
	{
		Monitor m = (Monitor) _obj;
		
		if((true == model.equals(m.model)) &&
		   (true == color.equals(m.color)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		int hashModel = model.hashCode();
		int hashColor = color.hashCode();
		
		System.out.printf("%d %d %d\n", hashModel, hashColor, (hashModel + hashColor) / 100000);
		
		// 두 해시값의 단위를 줄이기 위해 개수를 줄인다
		// 예) 10000개의 데이터를 비교한다 가정하면 해시값 결과가 0~9999가 나오도록 나눠주면
		// 중복도 방지를 유지하면서 데이터량을 줄일 수 있다.
		return ((int)(hashModel + hashColor) / 1000000);
	}
}