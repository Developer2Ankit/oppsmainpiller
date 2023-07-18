package oops.mainpiller;

public abstract class Overrriding2Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 obj=new Test4();
		obj.show();
		
	
	}
abstract void show();

}
class Test4 extends Overrriding2Abstract{
	public void show() throws ArithmeticException{
		
		System.out.println("You are in child show");
		
	}
}
