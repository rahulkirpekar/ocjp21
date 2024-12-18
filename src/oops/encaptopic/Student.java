package oops.encaptopic;

// Pure Encapsulation--Data safety--Data Secure
// POJO--Plain Object Java Object
public class Student 
{
	private int rno=1;
	private String name;
	private int std;
	private double marks;
	
//	1) Constructor way
	
	// 1) Default Constructor
	//   Constructor-->special function
	public Student() 
	{
		System.out.println("Default Constructor==>"+rno+"---"+name+"---"+std);
		System.out.println("START :: Default Constructor");
		rno=10;
		name="rahul";
		std=12;
		marks=80;
		System.out.println("EXIT :: Default Constructor");
	}
	
	// 2) Parameterised Constructor
	public Student(int rno,String name,int std,double marks) 
	{
		System.out.println("START :: Parameterised Constructor");

		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		System.out.println("EXIT :: Parameterised Constructor");
	}
	
	// 3) Copy Constructor	
	public Student(Student s) 
	{
		System.out.println("START :: Copy Constructor");
		rno = s.rno;
		name = s.name;
		std = s.std;
		marks = s.marks;
		System.out.println("EXIT :: Copy Constructor");
	}
	
	
	
	
	

//  public--->2) setter and getters Methods way

	// setters---Mutators
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setStd(int std) 
	{
		this.std = std;
	}
	public void setMarks(double marks) 
	{
		this.marks = marks;
	}
	
	// Getters ---> Accessors

	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
	public double getMarks() 
	{
		return marks;
	}
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
