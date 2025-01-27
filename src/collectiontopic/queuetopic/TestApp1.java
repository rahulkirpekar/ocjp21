package collectiontopic.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		
		queueObj.add("zalak");
		queueObj.add("ankur");
		queueObj.add("rakesh");
		queueObj.add("sagar");
		queueObj.add("brijesh");
		queueObj.add("kunal");
		queueObj.add("rakesh");
		queueObj.add("sagar");
		
		while(!queueObj.isEmpty()) 
		{
			String name = queueObj.poll();
			
			System.out.println(name);
		}
//		Iterator<String> itr =	queueObj.iterator();
//		while(itr.hasNext()) 
//		{
//			String name = itr.next();
//			System.out.println(name);
//		}
	}
}