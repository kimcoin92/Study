package com.example.inheritance.teacher.school;

public class MiddleSubjectScore {
	private String term;	// �б�
	
	private int kor;		// �����
	private int eng;		// �����
	private int mth;		// ���м���
	private int sci;		// ���м���

	public MiddleSubjectScore()
	{
		
	}

	public MiddleSubjectScore(String _term, int _kor, int _eng, int _mth, int _sci) 
	{
		this.term = _term;
		this.kor = _kor;
		this.eng = _eng;
		this.mth = _mth;
		this.sci = _sci;
	}
	
	public boolean setScore(String _term, int _kor, int _eng, int _mth, int _sci) 
	{
		this.term = _term;
		this.kor = _kor;
		this.eng = _eng;
		this.mth = _mth;
		this.sci = _sci;
		
		return true;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMth() {
		return mth;
	}

	public void setMth(int mth) {
		this.mth = mth;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

}
