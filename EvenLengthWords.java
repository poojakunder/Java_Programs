package Java_string_programs;
//java program to print even length words in a string

public class EvenLengthWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String1="This is a java codin example";
		for(String word : String1.split(" ")) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}
		

	}

}
