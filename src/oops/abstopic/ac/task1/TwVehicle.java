package oops.abstopic.ac.task1;

public class TwVehicle extends Vehicle
{
	// method overridde--child specific behaviour provide
	public void getSpec() 
	{
		// child specific
		System.out.println("TwVehicle---getSpec() ");
	}
	
	public void getTwModelInfo() 
	{
		System.out.println("TwVehicle---getTwModelInfo()---child method");
	}
}
