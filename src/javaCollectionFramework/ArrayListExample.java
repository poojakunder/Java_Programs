package javaCollectionFramework;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("pooja");
		list1.add("Pari");
		list1.add("Poonam");	
		list1.add("Pooja");
		list1.add(0, "Java");
		System.out.println(list1);
//		list1.remove(2);
//		list1.remove("Java");
//		System.out.println(list1);
//		list1.removeAll(list1);
//		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.contains("pooja"));
		System.out.println(list1.indexOf("Poonam"));
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
	}

}
