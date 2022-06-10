package com.example.inheritance.teacher.school;

public class MiddleStudent extends Student{
	
	public static final int TERM_COUNT = 6;
	
	private String group;					//��	
	private MiddleSubjectScore[] score;		// ��������
	
	
	// Middle score ������
	public boolean setScore(String _term, int _kor, int _eng, int _mth, int _sci) 
	{
		int termIndex = Student.getTermIndex(_term);
		
		if(termIndex == -1)
			return false;
		
		return score[termIndex].setScore(_term, _kor, _eng, _mth, _sci);
	}
	
	public MiddleStudent()
	{
		score = new MiddleSubjectScore[TERM_COUNT];
		
		for(int i = 0; i < TERM_COUNT; i++)
			score[i] = new MiddleSubjectScore();
		
		score[0] = new MiddleSubjectScore();
	}
	
	public MiddleStudent(String _group)
	{
		this();
		group = _group;
	}
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public MiddleSubjectScore[] getScore() {
		return score;
	}

	public void setScore(MiddleSubjectScore[] score) {
		this.score = score;
	}

	//���� �б⺰ ��������� ���ϴ� �޼ҵ�.
	public float getSubjectAverage(String _subject)
	{
		int total = 0;
		switch (_subject)
		{
		case "kor" :
			for (int i = 0; i < TERM_COUNT; i++)
			{
				total = total + score[i].getKor();
			}
		break;
		
		case "eng" :
			for (int i = 0; i < TERM_COUNT; i++)
			{
				total = total + score[i].getEng();
			}
		break;
		
		case "mth" :
			for (int i = 0; i < TERM_COUNT; i++)
			{
				total = total + score[i].getMth();
			}
		break;
		
		case "sci" :
			for (int i = 0; i < TERM_COUNT; i++)
			{
				total = total + score[i].getSci();
			}
		break;
		}
		
		return total / TERM_COUNT;
	}
	//���� ������� : ���� 1-1, 1-2, 2-1 2-2 3-1 3-2
	
	//1-1�б� ������� : 1-1�б��� (����+����+����+����) /4 
}



