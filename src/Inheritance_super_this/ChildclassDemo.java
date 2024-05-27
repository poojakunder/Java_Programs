package Inheritance_super_this;

public class ChildclassDemo extends ParentClass {
//multiple inheritance (multiple parents not allowed ) in java, for that we can use interface
	//this refers to current object
	String color="Green";
	int a = 2;
	public ChildclassDemo() {
		super();
		System.out.println("child class constructor");
		
	}
	public void engine() {
		int a=3;
		System.out.println("local variable "+a);
		System.out.println("Global variable of same class/object level "+this.a);
		System.out.println("new engine");
	}
	public void color() {
		System.out.println(color);
		System.out.println(super.color); //color coming from parent class
	}
	
	//polymorphism
	//function/method overloading
	//same name but different types or parameters
	public void getData(int a)
	{
		System.out.println("getdata in fd");
	}
	public void getData(double a)
	{
		System.out.println("getdata in rr ");
	}
	public int getData()
	{
		return 0;
	}
	//method overriding
	public void audiosystem() {
		System.out.println("in child - audio system");
		super.audiosystem();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildclassDemo demo=new ChildclassDemo();
		demo.engine();
		demo.gear();
		demo.getData(10);
		demo.getData(9.8);
		demo.color();//parent as it has super in it
		System.out.println(demo.getData());
		demo.audiosystem();//in child - audio system
		ParentClass parent=new ChildclassDemo();
		parent.audiosystem(); //in child - audio system
		

	}

}
