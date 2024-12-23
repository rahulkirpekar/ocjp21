package oops.abstopic.ac.concept;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		A obj = new A();// C.E
		
//		B obj = new B();
//		obj.test1();
//		obj.test2();
		
		// Upcasting --->Polymorphic Object
		A objA = new B();
		objA.test1();
		objA.test2();
		
		//obj.test3();// C.E
		
		if (objA instanceof B) 
		{
//			B objB = (B)objA;
//			objB.test3();
			
			// Downcasting
			((B)objA).test3();
		}
	}
}
