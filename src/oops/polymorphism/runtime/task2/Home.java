package oops.polymorphism.runtime.task2;

public class Home extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Home :: Son/Daughter  Behaviour");
	}
	public void getMovieOnTime() 
	{
		System.out.println("Home -- Son/Daughter-- Watching Movie");
	}
}
