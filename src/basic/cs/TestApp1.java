package basic.cs;

import java.util.Scanner;

// simple if
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no  = sc.nextInt();
		
		if(no > 0) 
		{
			System.out.println("No is Positive : " + no);
		}
		
		System.out.println("General Statements");
	}
}
