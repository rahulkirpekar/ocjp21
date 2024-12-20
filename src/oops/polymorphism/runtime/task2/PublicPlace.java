package oops.polymorphism.runtime.task2;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace :: Citizen Behaviour");
	}
	public void getPublicEvent() 
	{
		System.out.println("PublicPlace -- Citizen-- Attend Public Event");
	}
}
