package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int no1,no2,ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		no1=  sc.nextInt();
		System.out.println("Enter No2 : ");
		no2=  sc.nextInt();
		
		// Exception Handling ---try..catch
		
		try 
		{
			// raise exception by java code
			ans = no1 / no2;// code crashed
			
			String name = null;
			System.out.println("name.length() : " + name.length());
			
			int a[] = new int[5];
			
			a[5] = 10;
			
		}
		catch(NullPointerException | ArithmeticException e) 
		{
			ans = 0;
			e.printStackTrace();
		}
/*		catch(ArithmeticException e) 
		{
			ans = 0;
//			System.out.println(e + "Exception Handled By Catch Block");
			e.printStackTrace();
		}catch(NullPointerException e) 
		{
			ans = 0;
//			System.out.println(e + "Exception Handled By Catch Block");
			e.printStackTrace();
		}
*/		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Division : " + ans);
	}
}
