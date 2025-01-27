package jdbctopic.util;

import java.sql.Connection;
import java.sql.DriverManager;

// Java Program---MySql
public class DBConnection 
{
	// 1) Make Database credentials
	private static final String URLNAME     = "jdbc:mysql://localhost:3306/ocjp21";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME    = "root";
	private static final String PASSWORD	= "root";	

	// 2) create getConnection method
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3) Load Driver class
			Class.forName(DRIVERCLASS);
			

			// 4) get Database connection by DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}
