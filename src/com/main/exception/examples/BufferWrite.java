package com.main.exception.examples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferWrite
{
	public static void func2() throws IOException // throws : 나를 호출한 메서드에게 이 예외를 보낼꺼야.
	{
		Path file = Paths.get("F:\\sample.txt");
		
		BufferedWriter writer = null;
		
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('B');
		
		if (writer != null)
		{
			writer.close();
		}
	}
	
	public static void func1() throws IOException // throws : 내 위에 호출한 메서드에게 다시 보낼께.
	{
		func2();
	}
	
	public static void main(String[] args) // 내가 첫 호출 담당이니 예외를 받아야겠네.
	{
		try
		{
			func1();
		}
		catch (IOException excp) // 예외의 최종 목적지.
		{
			excp.printStackTrace();
		}
	}
}