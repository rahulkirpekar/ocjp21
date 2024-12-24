package oops.abstopic.interfacetopic.task1;

import java.util.Scanner;

public class TestApp1 
{
	// Vehicle vehicle = new TwVehicle();
	// TwVehicle twVehicle = (TwVehicle)vehicle;
	// twVehicle.getTwModelInfo();
	
									//   Upcasting----Polymorphic Object
	public static void getVehicleInfo(Vehicle vehicle) 
	{
		vehicle.getSpec();
		
		// instanceof-- operator---reference--->Object--->?
		
		if (vehicle instanceof 	TwVehicle) 
		{
			System.out.println("Hi I have TwVehicle Object");
			
			// 					Downcasting
			TwVehicle twVehicle = (TwVehicle)vehicle;// ClassCastException
			twVehicle.getTwModelInfo();// compiletime pass
			
		}else if(vehicle instanceof LmvVehicle) 
		{
			System.out.println("Hi I have LmvVehicle Object");

			LmvVehicle lmvVehicle = (LmvVehicle)vehicle;
			lmvVehicle.getLmvModelInfo();
			
		}else if(vehicle instanceof HmvVehicle) 
		{
			System.out.println("Hi I have HmvVehicle Object");
			
			HmvVehicle hmvVehicle = (HmvVehicle)vehicle;
			hmvVehicle.getHmvModelInfo();
		}
	}
//	public static void getVehicleInfo(LmvVehicle lmvVehicle) 
//	{
//		lmvVehicle.getSpec();
//	}
//	
//	public static void getVehicleInfo(HmvVehicle hmvVehicle) 
//	{
//		hmvVehicle.getSpec();
//	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice of Vehicle : ");
		
		System.out.println("1) For Two Vehicle");
		System.out.println("2) For LightMotor Vehicle");
		System.out.println("3) For Heavy Motor Vehicle");
		int choice  =  sc.nextInt();
		
		switch(choice) 
		{
			case 1: TwVehicle tw = new TwVehicle();
					getVehicleInfo(tw);
					break;
	
			case 2: LmvVehicle lmv = new LmvVehicle();
					getVehicleInfo(lmv);
			
					break;
	
			case 3: HmvVehicle hmv = new HmvVehicle();
					getVehicleInfo(hmv);
					break;
		}
	}
}
