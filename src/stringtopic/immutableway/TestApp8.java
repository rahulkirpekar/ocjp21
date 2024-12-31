package stringtopic.immutableway;
public class TestApp8 
{
	public static void main(String[] args) 
	{
		// Modification Methods:
/*		String name1 = "royal";
		String name2 = "technosoft";
		String name3 = name1.concat(name2);// royaltechnosoft
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name3 : " + name3);
		
		String value = "This is Java which is developed by James Gosling";
		String newValue = value.replace("is", "was");
		System.out.println("value : " + value);
		System.out.println("newValue : " + newValue);
		String value = "This is Java which is developed by James Gosling";
		String words[] = value.split("\\s");
		System.out.println("words length : "  +words.length);
		
		for (int i = 0; i < words.length; i++) 
		{
			System.out.println("words["+i+"] : " + words[i]);
		}
		String name1 = "royal";
		
		char name[] = name1.toCharArray();
		
		for (int i = 0; i < name.length; i++) 
		{
			System.out.println(name[i]);
		}
		// string data --- convert into byte
		// strig data ---byte---write----file
		String name1 = "royal";

		byte b[] = name1.getBytes();
		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println("b["+i+"] : " + b[i]+"---"+name1.charAt(i));
		}
		int no1 = 20;
		int no2 = 10;
		String no1Str = String.valueOf(no1);// 20--String
		String no2Str = String.valueOf(no2);// 10--String
		System.out.println("Addition : " + (no1Str + no2Str));// 2010
		TestApp8 obj = new TestApp8();
		System.out.println(obj);// obj.toString()
		System.out.println("String.valueOf(obj) : " + String.valueOf(obj));
		String no1Str = "20";
		String no2Str = "10";
		System.out.println("Addition : " + (no1Str+no2Str));
		int no1 = Integer.parseInt(no1Str);
		int no2 = Integer.parseInt(no2Str);
		int ans = no1+no2;
		System.out.println("Addition : " + ans);// 30
 */
		
		String name1 = "royal";
		String name2 = new String("royal").intern();
		
		System.out.println("(name1==name2) : " +(name1==name2));

	}
}