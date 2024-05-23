package Java_string_programs;

public class getCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="String";
		int index=2;
		for(int i=0;i<str.length();i++) {
			if(i==index) {
				System.out.println(str.charAt(i));
				break;
			}
			
		}

	}

}
