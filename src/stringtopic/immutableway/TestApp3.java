package stringtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";

		System.out.println("Name1 : " + name1 +"---"+name1.hashCode());// royal
		
		 name1 = "technosoft";
		 System.out.println("Name1 : " + name1 +"---"+name1.hashCode());// technosoft
		
		 // Immutable behaviour
		 name1.concat(" pvt ltd");// "technosoft pvt ltd"
		 System.out.println("Name1 : " + name1 +"---"+name1.hashCode());// technosoft
	}
}
