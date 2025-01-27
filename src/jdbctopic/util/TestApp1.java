package jdbctopic.util;

import java.sql.Connection;

public class TestApp1 
{
	public static void main(String[] args)  
	{
		Connection conn = DBConnection.getConnection();
		
		if (conn!=null) 
		{
			System.out.println("Db connected : " + conn);
			
		} else 
		{
			System.out.println("Db not connected : " + conn);
		}
	}
}
