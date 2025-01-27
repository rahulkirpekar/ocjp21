package collectiontopic.listtopic;

public class Student 
{
	int rno,std;
	String name;
	
	public Student() 
	{
	}
	public Student(int rno, String name,int std) 
	{
		this.rno = rno;
		this.std = std;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return rno+" " + name+" " + std;
	}
}
