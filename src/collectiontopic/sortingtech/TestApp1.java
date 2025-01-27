package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// List			Set			Queue			Map
//			-		   TreeSet	 PriorityQueue		TreeMap

		
		// List:-[  ArrayList , Vector , LinkedList ]
		
		// Data:-[Primitive / String]---possible sorting
//          |
		// Collections.sort(list);
		
		// Collections(class)			Collection(I)
		

//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(5);
//		list.add(4);
//		list.add(3);
//		list.add(2);
//		list.add(1);

		ArrayList<String> list = new ArrayList<>();
		list.add("dhaval");
		list.add("sagar");
		list.add("vivek");
		list.add("samir");
		list.add("ramesh");
		list.add("rahul");
		
		for (int i = 0; i < list.size(); i++) 
		{
			String value = list.get(i);
			
			System.out.println(value);
		}
		// Sorting Data--[primitive / String]
		Collections.sort(list);
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i < list.size(); i++) 
		{
			String value = list.get(i);
			
			System.out.println(value);
		}
	}
}