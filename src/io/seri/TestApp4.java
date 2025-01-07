package io.seri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		try(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ocjp21\\list1.txt");
				ObjectInputStream oin =new ObjectInputStream(fin) 
				)
		{
			Student s[] = (Student[])oin.readObject(); 
			
			for (int i = 0; i < s.length; i++) 
			{
				s[i].disp();
			}
		}catch(Exception  e) 
		{
			e.printStackTrace();
		}
	}
}
