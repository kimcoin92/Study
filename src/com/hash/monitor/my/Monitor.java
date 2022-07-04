package com.hash.monitor.my;

public class Monitor
{
	private String model;
	private int colorType;
	
	public Monitor()
	{
		
	}
	
	public Monitor(String _model, int _colorType)
	{
		model = _model;
		colorType = _colorType;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String _model)
	{
		model = _model;
	}

	public int getcolorType()
	{
		return colorType;
	}

	public void setcolorType(int _colorType)
	{
		colorType = _colorType;
	}
	
	@Override
	public boolean equals(Object _product)
	{
		boolean result = false;
		
		if(model == ((Monitor)(_product)).model)
		{
			result = true;
		}
		else if(colorType == ((Monitor)(_product)).colorType)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result;
	}

	@Override
	public String toString()
	{
		return "Monitor [model : " + model + ", colorType : " + colorType + "]";
	}
	
	@Override
	public int hashCode()
	{
		return colorType % 5;
	}
}