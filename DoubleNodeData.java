public class DoubleNodeData {
	private int 	value1;
	private String 	value2;
	
	public DoubleNodeData() {		
		
	}
	
	public DoubleNodeData(int _value1, String _value2) {		
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

}
