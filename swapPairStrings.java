package Java_string_programs;

public class swapPairStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(swapPair("JavaLearn"));

	}
	public static String swapPair(String str) {
		if(str==null || str.isEmpty()) 		
			return str;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i+=2) {
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		return new String(ch);
		
	}

}
