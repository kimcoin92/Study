public class DoubleNode {
	private DoubleNodeData 	data;		// 노드데이터
	private DoubleNode 		next;		// 다음노드의 링크정보.
	private DoubleNode		prev;

	public DoubleNode()
	{
		data = null;
		next = null;
		prev = null;
	}

	public DoubleNode(DoubleNodeData _data)
	{
		data = _data;
		next = null;
		prev = null;
	}
	
	public DoubleNode(int _value1, String _value2)
	{
		data = new DoubleNodeData(_value1, _value2);
		next = null;
		prev = null;
	}
	
	public DoubleNodeData getData()
	{
		return data;
	} 
	
	public void setData(DoubleNodeData _data)
	{
		data = _data;
	} 
	
	public void setData(int _value1, String _value2)
	{
		if (data == null)
		{
			data = new DoubleNodeData(_value1, _value2);
		}
		else
		{
			data.setvalue1(_value1);
			data.setvalue2(_value2);			
			
		}
		
	}	
	
	public DoubleNode getNext()
	{
		return next;
	}
	
	public void setNext(DoubleNode _next)
	{
		next = _next;
	}
	
	public DoubleNode getPrev()
	{
		return prev;
	}
	
	public void setPrev(DoubleNode _prev)
	{
		prev = _prev;
	}
	
	
}
