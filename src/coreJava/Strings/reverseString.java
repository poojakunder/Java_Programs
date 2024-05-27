package coreJava.Strings;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		String a="Pooja";
		for(int i=a.length();i>0;i--) {
			rev=rev+a.charAt(i-1);
			
		}
		System.out.println(rev);

	}
}
