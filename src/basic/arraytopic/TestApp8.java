package basic.arraytopic;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		int a[][][] = new int[3][2][3];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("Enter A["+i+"]["+j+"]["+k+"] : ");
					a[i][j][k] = new java.util.Scanner(System.in).nextInt(); 
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("A["+i+"]["+j+"]["+k+"] : " + a[i][j][k]);
				}
			}
		}
	}
}