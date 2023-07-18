package oops.mainpiller;


class Car extends Vehicle{
	Car(){
		System.out.println(" car!");	
	}
	void drive() {
		System.out.println("I am driving car!");
	}	
}
class Vehicle{
	Vehicle(){
		System.out.println(" Vehicle!");	
	}
	void drive() {
		System.out.println("I am driving Vehicle!");
	}
}
public class InheritanceSample {

	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		// TODO Auto-generated method stub

	}

}
