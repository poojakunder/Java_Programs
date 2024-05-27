package coreJava.Strings;

public class immutableStringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 String is immutable , Why ?
		 whenever we create string literal with the same name ,
		 java doest create object again rather it just points to the object of the same value in string pool
		 so if we try to do any changes it would impact on the value as they are pointing to the same address 
		 in Spring constant pool (SCP).
		 
		 so to make it mutable java has Stringbuffer and stringbuilder
		  
		  
		 */
		//string buffer is threadsafe
		StringBuffer sb=new StringBuffer("hello");
		sb.append("Pooja");
		//existing value itself get modified here
		System.out.println(sb);
		sb.insert(2, "r");
		sb.replace(3, 5, "ab");
		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);
		System.out.println(sb.reverse());
		//when statment runs parellel, thread safe wont be there
		//string builder is not thread safe thats the only difference we have from stringbuffer and stringbuilder other than that all same
		StringBuilder sbuild=new StringBuilder("Stringbuilder");
		System.out.println(sbuild);
		
		
		//when to use .equals and == in java
		//.equals for content comparision
		//== address/object reference comparision
		String a="hello";
		String b="hello";
		String c=new String("hello");
		System.out.println("content comparision "+a.equals(c));
		System.out.println("address compare"+ a==b);
		System.out.println("address compare"+ a==c);
		System.out.println(a.hashCode()==b.hashCode());
		
		
	}
	

}
