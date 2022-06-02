package strex.main;

public class CompareTo {

	public static void main(String[] args) {
		
		String str1 = "def";
		String str2 = "abc";
		
		int comp = str1.compareTo(str2);
		
		     if(0 == comp)
		{
			System.out.println("두 문자열이 같다");
		}
		else if(0 <  comp)
		{
			System.out.println("사전 상 앞에 있는 경우");
		}
		else if(0 >  comp)
		{
			System.out.println("사전 상 뒤에 있는 경우");
		}
		else
		{
			
		}
		     
		     StringBuilder numPart = new StringBuilder();
		     
		     numPart.append("801010");
		     numPart.append("1001234");
		     
		     StringBuilder numFull = new StringBuilder(numPart);
		     
		     System.out.println(numFull);

	}

}