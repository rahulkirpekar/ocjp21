package stringtopic.mutableway;

public class TestApp1 
{
	void show(int a, char b) 
	{
		System.out.println("int char");
	}
	void show(char a, int b) 
	{
 		System.out.println("char int"); 
	}
	void show(int a, int b) 
	{
		System.out.println(a + " " + b);
	}
	public static void main(String[] args) 
	{
		TestApp1 m = new TestApp1();
		
		m.show('a', 'b');
		
//		TestApp1 obj = new TestApp1();
//		System.out.println("No : "+ obj.no);
		
		
/*		
		
		// Mutable Operation
//		StringBuilder sb  = new StringBuilder("Royal");// Non-ThreadBased Application
		StringBuffer sb  = new StringBuffer("Royal");// ThreadBased Application

		System.out.println("sb : " + sb+"----"+sb.hashCode()); // Royal

		sb.append(" Technosoft");// sb--->"Royal Technosoft"
		
		System.out.println("sb : " + sb+"----"+sb.hashCode()); 
	
		sb.reverse();
		System.out.println("sb : " + sb+"----"+sb.hashCode()); 
			
		
		
		// String 					StringBuilder/StringBuffer
		//--------------			----------------------------
		// concat------------------->append
		//   X---------------------->reverse
*/		
	}
}
