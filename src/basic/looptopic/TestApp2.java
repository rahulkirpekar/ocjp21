package basic.looptopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
/*		
		// i = row
		for (int i = 1; i <=5; i++) 
		{
			// j =column
			for (int j = 1; j <=5; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int i=1;
		while(i<=5) 
		{
			int j=1;
			while(j<=5) 
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
 */
		int i=1;
		do 
		{
			int j = 1;
			do 
			{
				System.out.print("* ");
				j++;
				
			}while(j<=5);
			
			System.out.println();
			i++;
		}while(i<=5);
	}
}