package com.inheritance.my.school;

class Middle extends Student
{
	protected String  grade;
	protected String  clss;
	protected int[][] score;
	
	public Middle()
	{
		super();
	}
	
	public Middle(String _name, String _birth, String _gender, String _grade, String _clss)
	{
		super(_name, _birth, _gender);
		grade = _grade;
		clss  = _clss;
		score = new int[4][6];
	}
	
	public String getGrade()
	{
		return this.grade;
	}
	
	public String getClss()
	{
		return this.clss;
	}
	
	public int[][] getScore()
	{
		return this.score;
	}
	
	@Override
	public String toString()
	{
		String str = new String();
		
		super.toString();
		
		str =
				"grade  = " + getGrade()  + "\n" +
				"clss   = " + getClss()   + "\n";
		
		return super.toString() + str;
	}
	
	public void setScore(int[][] _score)
	{
		score = _score;
	}
	
	public int getAveragebySeason(String _season)
	{
		
		int result = 0;
		
		switch(_season)
		{
		case "1-1" :
			
			for(int i = 0; i < score[0].length; i++)
			{
				result += score[0][i];
			}
			
			result = result / score[0].length;
			
		break;
		
		case "1-2" :
			
			for(int i = 0; i < score[0].length; i++)
			{
				result += score[1][i];
			}
			
			result = result / score[0].length;
			
		break;
		
		case "2-1" :
			
			for(int i = 0; i < score[0].length; i++)
			{
				result += score[2][i];
			}
			
			result = result / score[0].length;
			
		break;
		
		case "2-2" :
			
			for(int i = 0; i < score[0].length; i++)
			{
				result += score[3][i];
			}
			
			result = result / score[0].length;
			
		break;
		
		case "3-1" :
			
			for(int i = 0; i < score[0].length; i++)
			{
				result += score[4][i];
			}
			
			result = result / score.length;
			
		break;
		
		case "3-2" :
			
			for(int i = 0; i < score[0].length; i++)
			{
				result += score[5][i];
			}
			
			result = result / score.length;
			
		break;
		
		default :
			
			result = ERROR_INVAILD;
			
		break;
		}
		
		return result;
	}
	
	public int getAveragebySubject(String _subject)
	{
		
		int result = 0;
		
		switch(_subject)
		{
		case "영어" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][1];
			}
			
			result = result / score.length;
			
		break;
		
		case "수학" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][2];
			}
			
			result = result / score.length;
			
		break;
		
		case "과학" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][3];
			}
			
			result = result / score.length;
			
		break;
		
		default :
			
			result = ERROR_INVAILD;
			
		break;
		}
		
		return result;
	}
}
