package stringtopic.immutableway;

public class TestApp7 
{
	public static void main(String[] args) 
	{
//		Searching Methods:
//		**********************		
		//             0123456789012345...
		String name = "Royal Technosoft Private Technosoft Limited";
		
//		int index = name.indexOf("Technosoft");
//		System.out.println("index : " +index);
		
//		int index = name.indexOf("Technosoft",10);
//		System.out.println("index : " +index);
		
//		int index = name.lastIndexOf("Technosoft");
//		System.out.println("index : " +index);
		
//		boolean flag = name.contains("Technosoft");
//		System.out.println("flag : " + flag);
		
//		boolean flag = name.startsWith("Royal");
//		System.out.println("flag : " + flag);
		
		boolean flag = name.endsWith("Limited");
		System.out.println("flag : " + flag);
	}
}



