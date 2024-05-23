package Java_string_programs;
//insert a string to another string
public class InsertAStringToAnother {
	public static void main(String[] args) {
		String originalString="String in str1";
		String StringTobeInserted="For";
		int index=6;
		String newString=new String();
		for(int i=0;i<originalString.length();i++) {
			newString+=originalString.charAt(i);
			if(i==index) {
				newString+=StringTobeInserted+" ";
			}
			}
		System.out.println("new string is "+newString);
		}
		
		
	}

