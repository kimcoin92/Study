/**
 *  작성자 : 김주화 (kimcoin92)
 *  최초 작성일 : 2022년 07월 01일
 *  최근 수정일 : 2022년 07월 05일
 */

package com.algorithm.linkedlist;

public class NodeData
{
	// 내 코드
	
	private int    value1;
	private String value2;
	
	public NodeData()
	{
		value1 = 0;
		value2 = "";
	}
	
	public NodeData(int _value1, String _value2)
	{
		value1 = _value1;
		value2 = _value2;
	}

	public int getValue1()
	{
		return value1;
	}

	public void setValue1(int _Value1)
	{
		value1 = _Value1;
	}

	public String getValue2()
	{
		return value2;
	}

	public void setValue2(String _value2)
	{
		value2 = _value2;
	}
	
	public void setRecord(int _value1, String _value2)
	{
		value1 = _value1;
		value2 = _value2;
	}

	@Override
	public String toString()
	{
		return "Data [value1=" + value1 + ", value2=" + value2 + "]";
	}
	
	// 정성훈 강사님의 코드
	
	/*
	private int 	value1;
	private String 	value2;
	
	public NodeData() {
		value1 = 0;
		value2 = "";
		
	}
	
	public NodeData(int _value1, String _value2) {		
		this.value1 = _value1;
		this.value2 = _value2;
	
	}
	
	public void setNodeData(int _value1, String _value2) {		
		this.value1 = _value1;
		this.value2 = _value2;
	
	}

	public int getvalue1() {
		return value1;
	}

	public void setvalue1(int _value1) {
		this.value1 = _value1;
	}

	public String getvalue2() {
		return value2;
	}

	public void setvalue2(String _value2) {
		this.value2 = _value2;
	}

	@Override
	public String toString() {
		return "NodeData [value1=" + value1 + ", value2=" + value2 + "]";
	}
	*/
}