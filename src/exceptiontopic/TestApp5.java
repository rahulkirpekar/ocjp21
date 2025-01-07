package exceptiontopic;

import java.util.Scanner;

public class TestApp5 
{
	public static  void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception
			throw new InvalidAgeException("Invalid Age for Vote,\n\tPlease enter age greater than 18");
		} else 	
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
			
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("After try..catch in Main");
	}
}
