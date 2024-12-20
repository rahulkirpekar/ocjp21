package oops.polymorphism.runtime.task2;

import java.util.Scanner;

public class TestApp1 
{
								// 		Upcasting
	public static void getPersonProfile(Person person) 
	{
		person.getBehave();
		
		if (person instanceof Org) 
		{
			// Downcasting
			Org employee = (Org)person;
			employee.getWorkOnTask();
			
		} else if(person instanceof Home)
		{
			Home child = (Home)person;
			child.getMovieOnTime();
			
		}else if(person instanceof PublicPlace)
		{
			PublicPlace citizen = (PublicPlace)person;
			citizen.getPublicEvent();
			
		}else if(person instanceof School)
		{
			School student = (School)person;
			student.getAnnualFunction();
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select Person Location : ");
		System.out.println("1) For Organisation");
		System.out.println("2) For Home");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For School");
		int choice = sc.nextInt();

		
		switch (choice) 
		{
			case 1: Org org = new Org();
					getPersonProfile(org);
					break;
					
			case 2: Home home = new Home();
					getPersonProfile(home);
					break;
					
			case 3: PublicPlace publicPlace = new PublicPlace();
					getPersonProfile(publicPlace);
					break;
			
			case 4: School school = new School();;
					getPersonProfile(school);
					break;
					
			default: System.out.println("Invalid Location of Person");
					break;
		}
	}
}
