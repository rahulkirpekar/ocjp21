package basic.cs;

import java.util.Scanner;

// Ladder if..else
public class TestApp3 
{
	public static void main(String[] args) 
	{
//		no > 0
//		no < 0
//		no == 0
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no  = sc.nextInt();
		
		if(no > 0) 
		{
			System.out.println("No is Positive : " + no);
		}
		else if(no < 0) 
		{
			System.out.println("No is Negative : " + no);
		}
		else if(no == 0)
		{
			System.out.println("No is Zero : " + no);
		}
	}
}