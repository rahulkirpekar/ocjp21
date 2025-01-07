package io.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try
		(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ocjp21\\royalstudentlisst.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
		 )
		{
			Student s1 =  (Student)oin.readObject();
		
			s1.disp();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e1) 
		{
			e1.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}

}
