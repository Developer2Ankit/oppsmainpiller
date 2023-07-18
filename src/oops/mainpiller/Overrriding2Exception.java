package oops.mainpiller;

public class Overrriding2Exception {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Overrriding2Exception obj=new Overrriding2Exception();
			obj.show();
		
	}
protected void show() {
	System.out.println("You are in main show");
}

}
class Test2 extends Overrriding2Exception{
	public void show()  {
		
		System.out.println("You are in child show");
		
	}
}
