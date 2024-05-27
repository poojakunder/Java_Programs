package constructor_Demo;

public class ConstructorDemo {
	//constructor is block of code gets called when object of class gets created
	//compiler calls default/implicit constructor if no constructor defined
	public ConstructorDemo() {
		System.out.println("default constructor");		
	}
	public ConstructorDemo(int a,int b) {
		System.out.println("parameterized constructor");
	}
	public ConstructorDemo(String s) {
		System.out.println("parameterized string constructor");
	}
	public void getData() {
		System.out.println("Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo demo=new ConstructorDemo();
		demo.getData();
		ConstructorDemo demo1=new ConstructorDemo(10,20);
		ConstructorDemo demo2=new ConstructorDemo("hey");

		
		

	}

}
