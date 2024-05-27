package coreJava.Interface_demo;

public class AustralianTraffic implements InterfaceDemo1,ContinentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******with class reference and object*******");
		AustralianTraffic a=new AustralianTraffic();
		a.greenGo();
		a.FlashYellow();
		a.redStop();
		System.out.println(a.a);
		a.continent();
		System.out.println("******with first interface reference and class object*******");
		InterfaceDemo1 demo1=new AustralianTraffic();
		demo1.FlashYellow();
		demo1.greenGo();
		demo1.redStop();
		System.out.println(demo1.a);
		System.out.println("******with second interface reference and class object*******");
		//you cant call method defined in continent interface as we have object in interface demo interface reference so do below
		ContinentInterface c1=new AustralianTraffic();
		c1.continent();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop");
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlashYellow");
		
	}

	@Override
	public void continent() {
		// TODO Auto-generated method stub
		System.out.println("continent interface");
		
	}

}
