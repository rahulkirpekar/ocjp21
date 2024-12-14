package basic.arraytopic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		// 2'd Array --- Declaration
		int a1[][] = new int[5][3];//valid
//		int[][] a1 = new int[5][3];//valid
//		int [][]a1 = new int[5][3];//valid
//		int [][] a1 = new int[5][3];//valid
//		int []a1[] = new int[5][3];//valid
		
//		int a1[][] = null;
//		a1 = new int[5][3];//valid

//		   ij
//		0--00 , 01 , 02
//		1--10 , 11 , 12
//		2--20 , 21 , 22
//		3--30 , 31 , 32
//		4--40 , 41 , 42
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a1.length : " + a1.length);
		
		System.out.println("a1[0].length : " + a1[0].length);
		// student ---i
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : " );
				a1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " +a1[i][j]);
			}
		}
		//  i  j  
		//a[0][0] = marks
		//a[0][1]
		//a[0][2]
		
		//a[1][0] = marks
		//a[1][1]
		//a[1][2]
				
		
		
	}
}
