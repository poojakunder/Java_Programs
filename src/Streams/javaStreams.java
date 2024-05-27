package Streams;

//streams and lamda
import java.util.ArrayList;
import java.util.stream.Stream;

public class javaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stream is collection of strings
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("pooja");
		list1.add("Pari");
		list1.add("Poonam");	
		list1.add("Poojadfd");
		list1.add(0, "Java");
		//stream can process collections parellely
		//->lamda function
		long c=list1.stream().filter(s->s.startsWith("P")).count();
		System.out.println(c);
		//2nd way
		long d= Stream.of("pfdfd","fdfd","vcvc","iue").filter(s->
		{
			s.startsWith("f");
			return false;
	
		}).count();
		System.out.println(d);
		
		//use forEach streams to print collection list
		list1.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));		
		

	}

}
