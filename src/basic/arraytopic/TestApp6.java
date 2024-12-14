package basic.arraytopic;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// Jagged Array--in--2'd Array --- Decalration + Initialisation
		//             0	   1        2 
		//           ------- ------- -------
		int a[][] = {{1,2,3,4},{4,5,6,7,8,9},{7,8}};
				
		System.out.println("a.length : " + a.length);// 3
		System.out.println("a[0].length : " + a[0].length);// 4
		System.out.println("a[1].length : " + a[1].length);// 6
		System.out.println("a[2].length : " + a[2].length);// 2
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
//		System.out.println("a[0][0] : " + a[0][0]);
				
//		      1   2   3
//		      4   5   6
//		      7   8   9
				
		
		
	}
}
