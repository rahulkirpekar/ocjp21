package basic.arraytopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double marks[] = new double[5];
		
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println("Enter Marks["+i+"] : ");
			marks[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println("Marks["+i+"] : " + marks[i]);
		}
	}
}
