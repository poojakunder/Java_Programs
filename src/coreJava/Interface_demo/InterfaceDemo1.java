package coreJava.Interface_demo;

public interface InterfaceDemo1 {
	//all methods are unimplemented,strictly public modifier
	//cant write method implementation in interface, it just has method signature
	//classes which implements interface will define logic for the methods
	public int a=4; //access modifier of variable in interface should be PUBLIC
	public void greenGo();
	public void redStop();
	public void FlashYellow();
	

}
