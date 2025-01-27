package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj = new ArrayList();
		
		listObj.add(true);//0 <===itr
		listObj.add('r');//1
		listObj.add(10);//2
		listObj.add(324L);//3
		listObj.add(12.21f);//4
		listObj.add(1234.324);//5
		listObj.add("royal");//6
		
		Student s= new Student(1, "rahul", 12);
		listObj.add(s);//7

		System.out.println("listObj.size() : " + listObj.size());
		
		
		// Java-8--Stream API
		listObj.stream().forEach(obj->System.out.println(obj));
		
		
/*		
   		//--------------------------------------------------------------------------------
		Iterator itr =	listObj.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
		//--------------------------------------------------------------------------------
		for (int i = 0; i < listObj.size(); i++) 
		{
			System.out.println("listObj.get("+i+") : " + listObj.get(i));
		}
		//--------------------------------------------------------------------------------
		// for Each / Advanced for loop / Enhanced for..loop
		for(Object obj : listObj) 
		{
			System.out.println(obj);
		}
		   
		//--------------------------------------------------------------------------------
*/
		
		
		
		
		
	}
}
