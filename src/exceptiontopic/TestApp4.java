package exceptiontopic;

// finally Block
public class TestApp4 
{
	public static void main(String[] args) 
	{
		int no1,no2,ans;
		
		no1 = 10;
		no2 = 0;
		try 
		{
			ans = no1/no2;
			
		} catch (NullPointerException e) 
		{
			System.out.println("NullPointerException--I am Catch Block");
			ans = 0;
			e.printStackTrace();
		}finally 
		{
			// Database/File/Socket connections--close
			System.out.println("Hi I am Finally Block");
		}
		System.out.println("Addition : " + ans);
	}
}
