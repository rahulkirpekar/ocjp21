package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("dhaval");
		list.add("sagar");
		list.add("vivek");
		list.add("samir");
		list.add("ramesh");
		list.add("rahul");

		// public final classs---System
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("list : " + list);
	}
}