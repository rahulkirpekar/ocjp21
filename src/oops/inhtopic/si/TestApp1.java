package oops.inhtopic.si;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		AdminEmployee adminEmp = new AdminEmployee();
		
		adminEmp.scanData();
		adminEmp.dispData();
		
		TechEmployee techEmp = new TechEmployee();
		
		techEmp.scanData();
		techEmp.dispData();
		
	}

}
