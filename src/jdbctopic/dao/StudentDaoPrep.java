package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean sbean)
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES(?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep--insertStudent() Db not connected");
		}
		return rowsAffected;
	}
	
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno=?";
		PreparedStatement pstmt = null;
		Connection conn = DBConnection.getConnection();
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
			
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep--deleteStudent() Db not connected : " + conn);
		}
		return rowsAffected;
	}
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student set name=?,std=?,marks=? where rno=?";
		PreparedStatement  pstmt = null;
		Connection conn = DBConnection.getConnection();
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				pstmt.setInt(4, rno);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep--update() Db not connected : " + conn);
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllStudentRecord() 
	{
		String selectQuery = "SELECT * FROM student";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
			
				rs = pstmt.executeQuery();
				
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
			System.out.println("StudentDaoPrep---Db not connected : " + conn);
		}
		return list;
	}
	public static void main(String[] args) 
	{
//		------------DELETE Query-----------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno which you want to Student  : ");
		int rno = sc.nextInt();
		
		StudentDaoPrep dao  = new StudentDaoPrep();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record Deleted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
//		StudentDao
/*		
//		------------INSERT Query-----------------   
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao  = new StudentDaoPrep();
		
		StudentDao
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
