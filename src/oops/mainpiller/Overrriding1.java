package oops.mainpiller;

public class Overrriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		obj.show();
	
	
	}
void show() {
	System.out.println("You are in main show");
}

}
class Test extends Overrriding1{
	void show() {
		super.show();
		System.out.println("You are in child show");
		
	}
}
