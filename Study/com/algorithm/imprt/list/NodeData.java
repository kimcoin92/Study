package com.algorithm.imprt.list;

public class NodeData {
	
	private int		value1;
	private String	value2;
	
	// 기본 생성자
	public NodeData() {
		
		value1 = 0;
		value2 = "";
		
	}
	
	// 오버로딩 생성자
	public NodeData(int value1, String value2) {
		
		this.value1 = value1;
		this.value2 = value2;
		
	}
	
	// 데이터를 읽고 쓰는 Getter Setter
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
