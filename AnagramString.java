package Java_string_programs;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(AreAnagram()==true) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not a anagram");
		}
	
	}
	static boolean AreAnagram() {
		char[] str1= {'l','i','s','t','e','n'};
		char[] str2= {'s','i','l','n','e','t'};
		boolean flag=true;
		if(str1.length!=str2.length) {
			flag=false;
			return flag;
		}
		else {
			Arrays.sort(str1);
			Arrays.sort(str2);
			
		for(int i=0;i<str1.length;i++) {
			if(str1[i]!=str2[i]) {
				flag=false;
				return flag;
			}
		}
		return true;
		}
	}

}
