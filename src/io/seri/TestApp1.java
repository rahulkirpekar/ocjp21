package io.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		
		// s1---write ---file
		
		// Auto Closable Resource---java---7
		try(
				FileOutputStream fout = new FileOutputStream("royalstudentlisst.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
			) 
		{
			// data--object---->s1---->write ---->file
			out.writeObject(s1);
			
			System.out.println("success");
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
