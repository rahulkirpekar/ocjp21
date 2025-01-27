package collectiontopic.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	// HashMap--not maintain insertion order---KEY
	// LinkedHashMap---Maintain insertion---KEY 
	// TreeMap--sorting order---KEY
	
	public static void main(String[] args) 
	{
//		HashMap<Integer, String> mapObj = new HashMap<>();
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<>();
		TreeMap<Integer, String> mapObj = new TreeMap<>();
		
		mapObj.put(30, "rakesh");
		mapObj.put(11, "rahul");// [Key,Value]<---Entry
		mapObj.put(20, "manoj");
		mapObj.put(15, "ankur");
		mapObj.put(4, "sagar");
		
		for( Map.Entry<Integer, String>  e	: mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}