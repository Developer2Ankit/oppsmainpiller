package oops.mainpiller;

public class InterfaceCheck implements TestI,TestI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceCheck obj=new InterfaceCheck();
		obj.show();
	}

	@Override
	public void show() {
		System.out.println("Check");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runNow2() {
		// TODO Auto-generated method stub
		
	}

}

interface TestI{
	public static final int a = 0;
	void show();
	static void runNow() {
		
	}
void runNow2();
}
interface TestI2{
	public static final int a = 0;
	void show();
	static void runNow() {
		
	}
void runNow2();
}