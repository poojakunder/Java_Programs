package coreJava.Strings;

public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strings is prebuilt class in java
		
		
		String a ="hello"; // string literal
		String b="hello"; //it checks string pool if already do we have values in String pool if yes it doest create object rather it just points this variable to existing object
		
		//but here even though value is same,still it creates different object
		String ab=new String("hello"); //with string class
		
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(0,3));
		System.out.println(a.substring(3));
		System.out.println(a.concat(" Pooja"));
		a.toUpperCase();
		a.trim();
		String arr[]=a.split("e");
		System.out.println(arr[0]+" "+arr[1]);
		System.out.println(a.replace("e", "t"));
		
	}

}
