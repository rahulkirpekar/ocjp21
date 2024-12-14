package basic.arraytopic;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		int a[][] = new int[3][3];

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"]");
				a[i][j] = new java.util.Scanner(System.in).nextInt();
			}
		} 
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		} 
	}
}
