package oops.abstopic.ac.task1;

public class LmvVehicle extends Vehicle
{
	public void getSpec() 
	{
		// child specific
		System.out.println("LmvVehicle---getSpec() ");
	}
	
	public void getLmvModelInfo() 
	{
		System.out.println("LmvVehicle---getLmvModelInfo()---child method");
	}
}
