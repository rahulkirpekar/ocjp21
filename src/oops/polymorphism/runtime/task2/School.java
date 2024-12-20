package oops.polymorphism.runtime.task2;

public class School extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School :: Student Behaviour");
	}
	public void getAnnualFunction() 
	{
		System.out.println("School -- Student-- Attend Annual Function Event");
	}
}
