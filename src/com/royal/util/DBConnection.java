package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	// 1) Make credentials
	private static final String URLNAME = "jdbc:mysql://localhost:3306/test";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
		
	// 2) create Database getConnection method
	public static void getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3) load Driver classs
			Class.forName(DRIVERCLASS);
			
			// 4) DriverManager..getConnection
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			// 5) validate connection object
			if (conn!=null) 
			{
				System.out.println("Db Connected : " + conn);
				
			} else 
			{
				System.out.println("Db not Connected : " + conn);
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		DBConnection.getConnection();
	}
}
