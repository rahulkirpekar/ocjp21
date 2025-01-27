package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12,80);
		Student s2 = new Student(2, "sagar", 9,90);
		Student s3 = new Student(3, "kunal", 2,50);
		Student s4 = new Student(4, "rakesh", 8,60);
		Student s5 = new Student(5, "ramesh", 10,40);
		
		// Generics---Typesafe
		ArrayList<Student> listObj = new ArrayList<Student>();
		listObj.add(s1);//0
		listObj.add(s2);//1
		listObj.add(s3);//2
		listObj.add(s4);//3
		listObj.add(s5);//5
		
		ListIterator<Student> itr =	listObj.listIterator();
		while(itr.hasNext()) 
		{
			Student s =  itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd() +" " + s.getMarks());
		}
		System.out.println("-------------------------------------");
//		
		Collections.sort(listObj);
		
		itr =	listObj.listIterator();
		
		while(itr.hasNext()) 
		{
			Student s =  itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd() +" " + s.getMarks());
		}
	}
}
