package Java_string_programs;

public class ConvertStringToArray_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Pooja you are the best";
		String strArray[]=str.split(" ");
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]+",");
		}

	}

}
