package oops.abstopic.ac.task1;

public class HmvVehicle extends Vehicle
{
	public void getSpec() 
	{
		// child specific
		System.out.println("HmvVehicle---getSpec() ");
	}
	public void getHmvModelInfo() 
	{
		System.out.println("HmvVehicle---getHmvModelInfo()---child method");
	}
}
