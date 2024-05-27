package coreJava;

public class swapValues_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("before swap a "+a+" b "+b);
		System.out.println("after swap");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a "+a+" b "+b);
		
		//swap without using temp variable
		int c=1;
		int d=2;
		System.out.println("before swap c "+c+" c "+d);
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("after swap c "+c+" d "+d);

	}

}
