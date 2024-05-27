package javaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Set interface : 
		 * duplicate values are not allowed 
		 * There is no guarantee that elements stored sequentially/not ordered
		 * below classes implements set interface : 
		 * 
		 * Hashset
		 * treeset
		 * linkedHashset 
		 * 
		 */
		HashSet<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println(set1);
//		set1.remove(1);
		System.out.println(set1);
		
		//methods are same as methods in List so we can refer that
		
		//loop set or List interface or classes extends them
		Iterator<Integer>it=set1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
		

	}

}
