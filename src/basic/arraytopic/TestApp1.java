package basic.arraytopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Array Declaration
		// Data---Type---?
		//  5-----int
//-----------------------------------------		
		int a[] = new int[5]; // a[0],a[1],a[2],a[3],a[4]
//-----------------------------------------				
//		int a[] = null;
//		a = new int[5];
//-----------------------------------------
//		int []a = new int[5];
//-----------------------------------------
//		int[] a = new int[5];
//-----------------------------------------		
//		int [] a = new int[5];
//-----------------------------------------		
		
		// arrayName.length
//		String name = "royal";
//		System.out.println(name.length());

		System.out.println("Array Size : " + a.length);
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0 ;
		
		for(int i = 0 ; i < a.length ; i++) 
		{
			//i--[0,1,2,3,4]---a[0],a[1],a[2],a[3],a[4]
			System.out.println("Enter A["+ i +"] : "); 
			a[i] = sc.nextInt();	
		}
		for(int i = 4 ; i >=0 ; i--) 
		{
			sum = sum + a[i];
			System.out.println("A["+ i +"] : " + a[i]);
		}
		System.out.println("Sum : " + sum);
	}
}
