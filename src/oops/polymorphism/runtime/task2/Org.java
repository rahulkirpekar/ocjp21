package oops.polymorphism.runtime.task2;

public class Org extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Org :: Employee Behaviour");
	}
	public void getWorkOnTask() 
	{
		System.out.println("Org -- Employee -- Work on Office Task");
	}
}
