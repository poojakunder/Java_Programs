package collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map1=new HashMap<>();
		map1.put("Pooja", 1);
		map1.put("Pari", 2);
		map1.put("Indira", 3);
		map1.put("Kumar",4);
		System.out.println(map1);
		if(map1.containsKey("Pooja")) {
			System.out.println(map1.get("Pooja"));
		}
		System.out.println("map size is "+map1.size());
		System.out.println("Iterate Map using entryset method");
		System.out.println("*********************************");
		for(Map.Entry<String, Integer> items:map1.entrySet()) {
			System.out.println(items.getKey());
			System.out.println(items.getValue());
		}
		

	}

}
