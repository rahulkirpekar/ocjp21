package basic.arraytopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		// Array Declaration with Initialisation
//		int a[] = {10,20,30,40,50};
		
		// Array Declaration ,Instatiation and Initialisation
		int a[] = new int[] {10,20,30,40,50};
		
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"] : " + a[i]);
		}
	}
}
