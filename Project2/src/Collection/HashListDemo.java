//Hash map works in unorder manner.

package Collection;

import java.util.*;

public class HashListDemo {
	
	public static void main(String args[]) {
		
		//country(key) ,population(value)
		HashMap<String, Integer> map = new HashMap<>(); 
		
		//Insertion 
		map.put("India", 120);
		map.put("US", 30);
		map.put("China", 150);
		
		System.out.println(map);
		
		map.put("China", 180);
		System.out.println(map);
		
		//Search
//		if(map.containsKey("Indonesia")) {
//			System.out.println("Key is present in map");
//		}
//		else {
//			System.out.println("Key is not present in map");
//		}
//		System.out.println(map.get("China"));  //Key Exist
//		System.out.println(map.get("Indonesia")); //Key doesnot exist
		
		
//		for(Map.Entry<String,Integer>e:map.entrySet()) {
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
		
//		Set<String>keys = map.keySet();
//		for(String key:keys) {
//			System.out.println(key+" "+map.get(key));
//		}
		
		map.remove("China");
	System.out.println(map);
		
		}	
	}


