package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans =  no1 + no2;
		System.out.println("Addition : "  + ans);
		
		ans =  no1 - no2;
		System.out.println("Subtraction : "  + ans);
		
		ans =  no1 * no2;
		System.out.println("Multiply : "  + ans);
		
		ans =  no1 / no2;
		System.out.println("Division : "  + ans);
	}
}
