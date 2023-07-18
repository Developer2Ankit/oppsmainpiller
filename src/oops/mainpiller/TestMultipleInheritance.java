package oops.mainpiller;

public class TestMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new D();
b.test();
	}

}
interface A {
	public void test() ;
}
abstract class B implements A,C {
 
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	
}
interface C  {
	public void test();
}
class D extends B{

	@Override
	public void test() {
		System.out.println("HelloD");
		// TODO Auto-generated method stub
		
	}
	
}
 
