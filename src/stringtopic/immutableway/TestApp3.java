package stringtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		//             01234
		String name = "Royal";
		System.out.println("name.length() : " + name.length());
		
//		System.out.println(name.charAt(0));// 0---R
//		System.out.println(name.charAt(1));// 1---o
//		System.out.println(name.charAt(2));// 2---y
//		System.out.println(name.charAt(3));// 3---a
//		System.out.println(name.charAt(4));// 4---l
		
		for(int i = 0 ; i < name.length();i++) 
		{
			System.out.println("name.charAt("+ i +") : "+name.charAt(i));
		}
		
//		int a[] = new int[5];
//		System.out.println("a.length : " + a.length);// length--operator--to get arrau size
	}
}
