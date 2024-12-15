package Collection;

import java.util.*;
import java.util.Iterator;

public class Hashing {
	public static void main(String args[]) {
		
		//Creating
		HashSet<Integer> set = new HashSet<>();
		
		//Insert
		set.add(1);//List.add(el)
		set.add(2);
		set.add(3);
		set.add(1);
		
		//Size
		System.out.println("Size of set is: "+set.size());
		
		//Print all elements
		System.out.println(set);
		
//		//Search - contains
//		if(set.contains(1)) {
//			System.out.println("Set contains 1");
//		}
//		if(!set.contains(6)) {
//			System.out.println("does not contain");
//		}
//		
//		
//		//Delete
//		set.remove(1);
//		if(set.contains(1)) {
//			System.out.println("does not contain 1-we deleted1");
//		}
		
		
	//Iterator
		Iterator it = set.iterator();
	
		//hasNext;Next
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
