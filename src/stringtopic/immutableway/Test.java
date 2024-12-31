package stringtopic.immutableway;

//What is the output of the Java program?
public class Test 
{
	public static void main(String[] args) 
	{
		int out = 15;
		Test T = new Test();
		
		
		int ans = T.method(7, 4);
		
		System.out.println(ans);
		
//		for (int i = 4; i < 6; i++) 
//		{
//			// i ---[4,5]	
//			for (int j = 7; j >= 5; j--) 
//			{
//				// I--[4]--7-6-5
//				// j--[7,6,5]
//				if (i == j)
//				continue;
//
//				if (i > j) 
//				{
//					out += T.method(i, j);
//				} else 
//				{
//					//              7  4
//					out += T.method(j, i); 
//				}
//			 } 
//		}
//		System.out.print(out); 
	}
         //      7      4
	int method(int a, int b) 
	{
		System.out.println("===> a : " + a + " , b : " + b);
		if (a + b == 0) 
		{ 
			return 2; 
		}
		//     7 + (6,4)
		//     7 + 6 + (5,4)
		//     7 + 6 + 5 + (4,4)
		//     7 + 6 + 5 + 4 + (3,4)
		//     7 + 6 + 5 + 4 + 3 + (2,4)
		//     7 + 6 + 5 + 4 + 3 + 2(1,4)
		//     7 + 6 + 5 + 4 + 3 + 2 + 1(0,4)
		//     7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 (-1,4)
		//     7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 + -1(-2,4)
		//     7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 + -1 + -2(-3,4)
		//     7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 + -1 + -2 + -3(-4,4)
		//     7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 + -1 + -2 + -3 + 2
		//     13 + 9 + 2
		//     24
		return a + method(a - 1, b); 
	} 
}