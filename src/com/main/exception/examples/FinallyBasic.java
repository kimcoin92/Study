package com.main.exception.examples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyBasic
{
	public static void func2() throws IOException
	{
		Path file1 = Paths.get("F:\\sample1.txt");
		Path file2 = Paths.get("F:\\sample2.txt");
		
//		코드가 복잡해지는 try-catch-finally 방식
//		try
//		{
//			writer = Files.newBufferedWriter(file);
//			writer.write('A');
//			writer.write('B');
//		}
//		catch (IOException excp)
//		{
//			excp.printStackTrace();
//		}
//		finally // finally로 최종적으로 실행되는 구문
//		{
//			try
//			{
//				if (writer != null)
//				{
//					writer.close();
//				}
//			}
//			catch (IOException excp)
//			{
//				excp.printStackTrace();
//			}
//		}
		
		// try with resource : file과 같은 resource를 Java가 자동처리한다.
		// writer.close(); 문을 따로 작성할 필요가 없다.
		try (BufferedWriter writer1 = Files.newBufferedWriter(file1);
			 BufferedWriter writer2 = Files.newBufferedWriter(file2))
		{
			writer1.write('A');
			writer2.write('B');
		}
		catch (IOException excp)
		{
			excp.printStackTrace();
		}
	}
	
	public static void func1() throws IOException
	{
		func2();
	}
	
	public static void main(String[] args) throws IOException
	{
		func1();
	}
}