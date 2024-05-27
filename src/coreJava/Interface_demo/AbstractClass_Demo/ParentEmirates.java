package coreJava.Interface_demo.AbstractClass_Demo;

public class ParentEmirates extends AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentEmirates p=new ParentEmirates();
		p.abc();
		p.cde();

	}

	@Override
	public void cde() {
		// TODO Auto-generated method stub
		System.out.println("method without implementation in abstract class so getting implemented in child class");
		
	}

}
