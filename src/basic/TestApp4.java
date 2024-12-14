package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		// String ---class
		//      sc.next(); // single word
		//      sc.nextLine();//Single line---Multiple Words
		
		String name = null;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name : ");
//		String name = sc.next();//single word -  royal
//		String name = sc.nextLine();//Single line---Multiple Words
		name = sc.nextLine();//Single line---Multiple Words
		
		System.out.println("Name : "+ name);
		
		System.out.println("name.length() : " + name.length());
	}
}
