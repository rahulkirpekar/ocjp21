package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		// ArrayList
//		LinkedList<String> listObj = new LinkedList<>();
		Vector<String> listObj = new Vector<>();
		
		listObj.add("rahul");
		listObj.add("ankur");
		listObj.add("rakesh");
		listObj.add("sagar");
		listObj.add("brijesh");
		

		Iterator<String> itr =	listObj.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
