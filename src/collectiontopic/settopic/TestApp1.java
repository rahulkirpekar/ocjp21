package collectiontopic.settopic;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//   Set
		//    |
		// HashSet(C)
		// LinkedHashSet(C)
		// TreeSet(C)

//		HashSet<String> setObj = new HashSet<>();
		LinkedHashSet<String> setObj = new LinkedHashSet<>();
//		TreeSet<String> setObj = new TreeSet();
		
		setObj.add("zalak");
		setObj.add("ankur");
		setObj.add("rakesh");
		setObj.add("sagar");
		setObj.add("brijesh");
		setObj.add("kunal");
		setObj.add("rakesh");
		setObj.add("sagar");
		
		Iterator<String> itr =	setObj.iterator();
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
