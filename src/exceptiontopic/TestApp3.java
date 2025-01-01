package exceptiontopic;

import java.util.Scanner;
public class TestApp3 
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
			
			try 
			{
				ans = no1 / no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = null;
				System.out.println("name.length() : " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				int a[] = new int[5];
				a[5] = 10;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Division : " + ans);
	}
}
