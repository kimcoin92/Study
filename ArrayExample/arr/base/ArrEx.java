package arr.base;

public class ArrEx {

	public static void main(String[] args) {
		
		ArrEx object = new ArrEx();
		
		int[] a = new int[] {1, 2, 3, 4};
		int[] b = new int[] {5, 6, 7, 8};
		
		object.joinArray(a, b);
	}
	
	public int addArray(int[] arr)
	{
		int total = 0;
		
		for(int sum : arr)
		{
			total += sum;
		}
		
		return total;
	}
	
	public int[] joinArray(int[] arr1, int[] arr2)
	{
		int[] total = new int[arr1.length + arr2.length];
		
		int idx = 0;
		
		for(int val : arr1)
		{
			total[idx] = val;
					
			idx++;
		}
		
		for(int val : arr2)
		{
			total[idx] = val;
					
			idx++;
		}
		
		return total;
	}
}
