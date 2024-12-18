package oops.inhtopic.si;

import java.util.Scanner;

public class TechEmployee extends Employee
{
	String address;
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
		System.out.println("Enter Address : ");
		address = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println("TechEmployee==>"+id+" " + name+" " + salary+" " + dsgn+" "+address);
	}
	public static void main(String[] args) 
	{
		TechEmployee e = new TechEmployee();

		e.scanData();
		e.dispData();
	}
}
