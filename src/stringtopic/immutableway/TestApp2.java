package stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = new String("royal");

		System.out.println("name1==name2 : " + (name1==name2));// false
		
		System.out.println("name1.hashCode() : " +name1.hashCode());
		System.out.println("name2.hashCode() : " +name2.hashCode());

		System.out.println("name1 Address : " + System.identityHashCode(name1));
		System.out.println("name2 Address : " + System.identityHashCode(name2));
		
	}
}
