package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NO1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter NO2 : ");
		int no2 = sc.nextInt();
		
		int temp = no1;
		no1 = no2;
		no2 = temp;
		
		System.out.println("NO1 : " + no1);
		System.out.println("NO2 : " + no2);
	}
}
