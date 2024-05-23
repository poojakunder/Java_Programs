package Java_string_programs;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="abba";
		String str="abc";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
