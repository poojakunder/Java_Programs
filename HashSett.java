package collections;
import java.util.*; 

public class HashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		h.add("india");
		h.add("Australia");
		h.add("America");
		h.add("Canada");
		System.out.println(h);
		System.out.println(h.contains("india"));
		h.remove("Canada");
		System.out.println(h);
		//Iterating over hashset
		System.out.println("Iterating over hashset");
		Iterator<String> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	

	}

}
