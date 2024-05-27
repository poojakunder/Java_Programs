package exceptionDemo;

public class ExceptionDemo {
	int a=5;
	int b=7;
	int c=0;
	public void getData() {
	try {
		int k=b/c;
		int b[]= {1,2,3};
		System.out.println(b[9]);
	}
	catch(ArithmeticException e) {
		System.out.println("caught ArithmeticException");
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("caught ArrayIndexOutOfBoundsException");
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println("caught exception");
		System.out.println(e);
	}
	finally {
		System.out.println("in finally");
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo demo=new ExceptionDemo();
		demo.getData();
	}

}
