package coreJava.Interface_demo.AbstractClass_Demo;

public abstract class AbstractDemo {
	int c=10;

	//abstraction hiding implementation from user
	//any class which has method but no implementation and also it would have method implementation but all methods are absract ,is called abstract class
	//concrete method --> method with body
	//non concrete method ->non absract method
	//only abstract class can have abstract method ->MUST
	//we cant create/instantiate the object of abstract class
	public void abc() {
		System.out.println("abc in abstract class"); //concrete method
	}
	
	public abstract void cde();//no concrete method 
	
}
