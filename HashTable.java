package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> table=new Hashtable<>();
		table.put("A",1);
		table.put("B", 2);
		table.put("C",3);
		table.put("D",4);
		System.out.println("Hashtable size"+table.size());
		System.out.println("Table contents"+table);
		table.remove("B");
		System.out.println("Table contents"+table);
		//enumerating elements of hashtable
		System.out.println("Iterate");
		Enumeration<String> Keys=table.keys();
		while(Keys.hasMoreElements()) {
			String key=Keys.nextElement();
			System.out.println("Key is "+key+" value "+table.get(key));
		}
		

	}

}
