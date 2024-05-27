package javaCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key value pair
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "Pooja");
		map1.put(2, "Pari");
		map1.put(3, "Poonam");
		map1.put(4, "Kalsh");
		System.out.println(map1);
		System.out.println(map1.get(1));
		System.out.println(map1.get("Pooja")); //null
		map1.remove(1);
		System.out.println(map1);
		Set sm=map1.entrySet();
		Iterator it=sm.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		//hashtable is same as hashmap
		/*hashmap is not synchronized,not thread safe
		 * but hastable is threadsafe (operation will be performed when thread releases the process)
		 * 
		 * hash map can take null key/value
		 *  but hashtable doest allow null key/value
		 *  
		 *  hashmap can be iterated by Iterator
		 *  but hashtable needs enumarator for iteration
		 *  
		 */
		

	}

}
