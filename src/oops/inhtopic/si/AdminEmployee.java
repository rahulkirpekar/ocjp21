package oops.inhtopic.si;

import java.util.Scanner;

public class AdminEmployee extends Employee
{
	String roleOfWork;
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter roleOfWork : ");
		roleOfWork = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println("AdminEmployee ==> "+id+" " + name+" " + salary+" " + dsgn+" "+roleOfWork);
	}
}
