package Java_string_programs;

public class AddCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='s';
		String str="Geek";
		//adding at the end
		String str3=str+c;
		System.out.println(str3);
		//adding at the begining
		String str2=c+str;
		System.out.println(str2);
		//add at the index
		int index=2;
		StringBuffer stringbuffer=new StringBuffer(str);
		stringbuffer.insert(index, c);
		System.out.println(stringbuffer.toString());
		
	}

}
