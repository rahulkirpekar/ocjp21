package jdbctopic.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

// Java Program---MySql
public class DBConnection 
{
	// 2) create getConnection method
	public static Connection getConnection() 
	{
		String urlName = null;
		String driverClass = null;
		String userName = null;
		String password = null;
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ocjp21\\dbconfig.properties");
		
			Properties prop = new Properties();
			
			prop.load(fin);
		
			urlName = prop.getProperty("URLNAME").trim();
			driverClass = prop.getProperty("DRIVERCLASS").trim();
			userName = prop.getProperty("USERNAME").trim();
			password = prop.getProperty("PASSWORD").trim();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		Connection conn = null;
		try 
		{
			// 3) Load Driver class
			Class.forName(driverClass);
			

			// 4) get Database connection by DriverManager's getConnection method
			conn = DriverManager.getConnection(urlName, userName, password);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}
