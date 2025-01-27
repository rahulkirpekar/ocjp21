package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "sagar", 9);
		Student s3 = new Student(3, "kunal", 2);
		Student s4 = new Student(4, "rakesh", 8);
		Student s5 = new Student(5, "ramesh", 10);
		// Generics---Typesafe
		ArrayList<Student> listObj = new ArrayList<Student>();
		listObj.add(s1);//0
		listObj.add(s2);//1
		listObj.add(s3);//2
		listObj.add(s4);//3
		listObj.add(null);//4
		listObj.add(s5);//5
		
			
//			listObj.remove(2);
		
//		Student s = listObj.get(2);
//		System.out.println(s);
		
//		Iterator<Student> itr =	listObj.iterator();
//		while(itr.hasNext()) 
//		{
//			Student s =  itr.next();
//			System.out.println(s);
//		}
		
		
		ListIterator<Student> itr =	listObj.listIterator();
		while(itr.hasNext()) 
		{
			Student s =  itr.next();
			System.out.println(s);
		}
		System.out.println("=============");
		
		while(itr.hasPrevious()) 
		{
			Student s =  itr.previous();
			System.out.println(s);
		}

	}
}



