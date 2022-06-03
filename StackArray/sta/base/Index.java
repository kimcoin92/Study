package sta.base;

public class Index
{
	public static void main(String[] args)
	{
		int    idx    = 0;
		int    push   = 20;
		int    pop    = 20;
		double data   = 0;
		
		Stack object = new Stack(10);
		
		for(int i = 0; i < push; i++)
		{
			data = (Math.floor(Math.random() * 9)) + 1;
			
			object.push((int)data);
			System.out.println(object.getAll());
			
			idx = idx + 1;
		}
		
		for(int k = 0; k < pop; k++)
		{
			object.pop();
			System.out.println(object.getAll());
		}
		
	}
}
