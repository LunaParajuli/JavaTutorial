package collection;

import java.util.*;

public class LearnArrayList {
	public static void main(String args[]) {
	
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		System.out.println(list);
//		list.add(4);
//		System.out.println(list);
//		
//		
//		list.add(1,50); //This will add 50 in index 1..
//		
//		
//		List<Integer> newlist = new ArrayList<Integer>();
//		newlist.add(150);
//		newlist.add(160);
//		
//		list.addAll(newlist);
//		System.out.println(list);
//		
//		System.out.println(list.get(1));
		
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		System.out.println(list);
		
//		list.remove(1);//This will remove element of index 1..
//		System.out.println(list);
//		
//		list.remove(Integer.valueOf(30)); //This will remove element 30..
//		System.out.println(list);
//		
//		list.clear();  //This will remove all element...
//		System.out.println(list);
		
//		
//		list.set(2, 1000);
//		System.out.println(list);
//		
//		
//		System.out.println(list.contains(50));
//		System.out.println(list.contains(2000));
		
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println("The element is: "+list.get(i));
		}
		
			for(Integer element:list) {
				System.out.println("for each element is: "+element);
			}
			
			
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				System.out.println("iterator "+ it.next());
			}

	}
	
	

}
