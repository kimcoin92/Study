package strex.main;

public class ClassString {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		
		if(str1 == str2)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");
		}
		
		String str3 = new String ("def");
		String str4 = new String ("def");
		
		if(str3 == str4)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�ٸ���");
		}

	}

}