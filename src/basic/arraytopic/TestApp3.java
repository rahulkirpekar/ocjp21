package basic.arraytopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Array Declaration
		int a[] = new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		// Ascending Order
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = (i+1); j < a.length; j++) 
			{
				if(a[i] > a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"] : " + a[i]);
		}	
		System.out.println("Descending Order Sorting : ");
		
		// Descending Order
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = (i+1); j < a.length; j++) 
			{
				if(a[i] < a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"] : " + a[i]);
		}
	}
}
