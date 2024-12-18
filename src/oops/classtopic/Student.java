package oops.classtopic;

import java.util.Scanner;

public class Student 
{
	// class Properties = [1) Dm's + 2) Mf's]

	// 1) Data Members-->Instance Variables
	int rno;
	String name;
	int std;
	double marks;
	
	// 2) Member function
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
