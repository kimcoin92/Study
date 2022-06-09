// ��������

// �䱸����
// - ���л��� �г�, ��, ���� 4��(��������)�� �ִ�. ���� ����� 6�б� ������ �ִ�.
// - ����л��� �г�, ��, ���� 6��(���������翪)�� �ִ�. ���� ����� 6�б� ������ �ִ�.
// - �б�� 1-1, 1-2, 2-1, 2-2, 3-1, 3-2�бⰡ �ִ�.
// - ��� �л��� �̸�, �������, ���� ������ �ִ�.

// �䱸 �޼ҵ�
// - ����, �б⺰ ��������� ���ϴ� �޼ҵ� 
// - �г⺰ ��������� ���ϴ� �޼ҵ�
// - �̸�, �г�, ���� ����ϴ� �޼ҵ�
// - ��Ÿ �ʿ��� �޼ҵ�

package com.ext;

class Student
{
	public static final int ERROR_INVAILD = -1;
	
	private String name;
	private String birth;
	private String gender;
	
	public Student()
	{
		
	}
	
	public Student(String _name, String _birth, String _gender)
	{
		name    = _name;
		birth   = _birth;
		gender  = _gender;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getBirth()
	{
		return this.birth;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public String toString()
	{
		String str = new String();
		
		str =
				"name   = " + getName()   + "\n" +
				"birth  = " + getBirth()  + "\n" +
				"gender = " + getGender() + "\n";
		
		return str;
	}
}

/* ##################################################################################### */

class Middle extends Student
{
	private String  grade;
	private String  clss;
	private int[][] score;
	
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
	
	public int getAverage(String which)
	{
		
		int result = 0;
		
		switch(which)
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
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][0];
			}
			
			result = result / score.length;
			
		break;
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][1];
			}
			
			result = result / score.length;
			
		break;
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][2];
			}
			
			result = result / score.length;
			
		break;
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][3];
			}
			
			result = result / score.length;
			
		break;
		}
		
		return result;
	}
}

/* ##################################################################################### */

class High extends Student
{
	private String  grade;
	private String  clss;
	private int[][] score;
	
	public High()
	{
		super();
	}
	
	public High(String _name, String _birth, String _gender, String _grade, String _clss)
	{
		super(_name, _birth, _gender);
		grade = _grade;
		clss  = _clss;
		score = new int[6][6];
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
		
		str =
				"grade  = " + getGrade()  + "\n" +
				"clss   = " + getClss()   + "\n";
		
		return super.toString() + str;
	}
	
	public void setScore(int[][] _score)
	{
		score = _score;
	}
	
	public int[][] getAverage(int[][] score)
	{
		int[][] result = score;
		
		return result;
	}
	public int getAverage(String which)
	{
		
		int result = 0;
		
		switch(which)
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
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][0];
			}
			
			result = result / score.length;
			
		break;
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][1];
			}
			
			result = result / score.length;
			
		break;
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][2];
			}
			
			result = result / score.length;
			
		break;
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][3];
			}
			
			result = result / score.length;
			
		break;
		
		case "��ȸ" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][4];
			}
			
			result = result / score.length;
			
		break;
		
		case "����" :
			
			for(int i = 0; i < score.length; i++)
			{
				result += score[i][5];
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

/* ##################################################################################### */

public class School
{
	
	public static void main(String[] args)
	{
		Middle mstu = new Middle ("Kim", "09-01-01", "M", "1", "2");
		
		int[][] mstuScore = new int[][] {
			
				{40,  45,  35,  45},
				{45,  50,  40,  50},
				{65,  75,  65,  75},
				{45,  55,  70,  80},
				{70,  85,  100, 90},
				{100, 100, 100, 100}};
		
		mstu.setScore(mstuScore);
		
		System.out.println(mstu.getAverage("����"));
	}
}
