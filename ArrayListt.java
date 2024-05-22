package collections;

import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		System.out.println("iterating arraylist");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		list1.remove(0);
		System.out.println(list1);

	}

}
