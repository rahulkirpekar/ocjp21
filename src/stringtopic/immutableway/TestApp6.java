package stringtopic.immutableway;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// Comparison Methods:
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "ROYAL";
		
//		System.out.println("name1.equals(name2) : " + name1.equals(name2));
//		System.out.println("name1.equals(name3) : " + name1.equals(name3));// false
//		System.out.println("name1.equalsIgnoreCase(name3) : " + name1.equalsIgnoreCase(name3));// true
		
//		int flag = name1.compareTo(name2);// same--0
//		System.out.println("flag : " + flag);
//		flag = name1.compareTo(name3);
//		System.out.println("flag : " + flag);

		
		int flag = name1.compareTo(name3);
		System.out.println("flag : " + flag);
		
		flag = name1.compareToIgnoreCase(name3);
		System.out.println("flag : " + flag);
	}
}
