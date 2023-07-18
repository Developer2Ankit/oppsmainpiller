package oops.mainpiller;

public class AbstractClass extends VehicleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass obj=new AbstractClass();
		obj.start();
	}

	@Override
	void start() {
		System.out.println("Hello");
		// TODO Auto-generated method stub
		
	}

}
abstract class VehicleClass{
	
	abstract void start();
}
