package com.algorithm.imprt.list;

public class NodeData {
	
	private int		value1;
	private String	value2;
	
	// �⺻ ������
	public NodeData() {
		
		value1 = 0;
		value2 = "";
		
	}
	
	// �����ε� ������
	public NodeData(int value1, String value2) {
		
		this.value1 = value1;
		this.value2 = value2;
		
	}
	
	// �����͸� �а� ���� Getter Setter
	public int getValue1() {
		
		
		return value1;
		
	}

	
	public void setValue1(int value1) {
		
		
		this.value1 = value1;
		
	}

	
	public String getValue2() {
		
		
		return value2;
		
	}

	
	public void setValue2(String value2) {
		
		
		this.value2 = value2;
		
	}

}
