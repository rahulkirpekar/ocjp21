package oops.abstopic.interfacetopic.task1;

public class LmvVehicle implements Vehicle
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
