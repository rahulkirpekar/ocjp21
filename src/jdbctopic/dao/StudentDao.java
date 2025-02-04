package jdbctopic.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;
// Student---Statement---CRUD
// StudentDao - Student
public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0 ;
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";
	
		System.out.println("insertQuery : " + insertQuery);
		
		Statement stmt = null;
		
		// 1) get db connection object
		Connection conn = DBConnection.getConnection();

		// 2) validate conn object
		if (conn!=null) 
		{
			try 
			{
				// 3) create statement--insert query execute
				stmt = conn.createStatement();
				
				// 4) intsertQuery by executeUpdate method
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---insertStudent()---Db not conncted");
		}
		return rowsAffected;
	}
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student set name='"+sbean.getName()+"',std="+sbean.getStd()+",marks="+sbean.getMarks()+" where rno="+rno;
		Statement stmt = null;
		Connection conn = DBConnection.getConnection();
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao--update() Db not connected : " + conn);
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno="+rno;
		Statement stmt = null;
		Connection conn = DBConnection.getConnection();
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--delete() Db not connected : " + conn);
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllStudentRecord() 
	{
		String selectQuery = "SELECT * FROM student";
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);// int rno = rs.getInt("rno");
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
//					System.out.println(rno+" " + name+" " + std+" "+ marks);
					
					sbean = new StudentBean(rno, name, std, marks);

					list.add(sbean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---Db not connected : " + conn);
		}
		return list;
	}
	
	// name--->fetch--->record
	public StudentBean getStudentByName(String searchByBame) 
	{
		String selectQuery = "SELECT * FROM student WHERE name='"+searchByBame+"'";
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				rs.next();

				int rno = rs.getInt(1);// int rno = rs.getInt("rno");
				String name = rs.getString(2);
				int std = rs.getInt(3);
				int marks = rs.getInt(4);
				
				sbean = new StudentBean(rno, name, std, marks);

			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---Db not connected : " + conn);
		}
		return sbean;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
//		------------SELECT WITH WHERE clause Query-----------------

		StudentDao dao  = new StudentDao();

		StudentBean s = dao.getStudentByName(name);
		System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		
/*		
		ArrayList<StudentBean> list = dao.getAllStudentRecord();
		
		System.out.println("list.size() : " + list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
//		------------UPDATE Query-----------------
		System.out.println("Enter Rno which you want to update Student record : ");
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao  = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
//		------------DELETE Query-----------------
		System.out.println("Enter Rno which you want to Student  : ");
		int rno = sc.nextInt();
		
		StudentDao dao  = new StudentDao();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record Deleted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
    	------------INSERT Query-----------------    	
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao  = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record Inserted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/		
	}
}
