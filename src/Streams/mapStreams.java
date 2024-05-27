package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream.of("abc","def","fdff","efff").filter(s->s.endsWith("f")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream.of("abc","def","fdff","efff","a").filter(s->s.startsWith("a")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("pooja");
		list1.add("Pari");
		list1.add("Poonam");	
		list1.add("Poojadfd");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Ankit");
		list2.add("Ani");
		list2.add("fdf");	
		list2.add("rohit");
		
		Stream<String> newStreamAfterMege=Stream.concat(list1.stream(), list2.stream());
//		newStreamAfterMege.sorted().forEach(s->System.out.println(s));
		boolean flag=newStreamAfterMege.anyMatch(s->s.equalsIgnoreCase("Ankit"));
		System.out.println(flag);
		
		
		List<String> ls=Stream.of("abc","def","fdff","efff").filter(s->s.endsWith("f")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//have an array of integer, print unique numbers from the array and sort the array using streams
		List<Integer> name1=Arrays.asList(3,2,2,4,1);
		name1.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> ls1=name1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls1);

	}

}
