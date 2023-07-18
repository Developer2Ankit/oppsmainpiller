package oops.keywords;

public class FinalKeyword extends TestFinal{//here it is showing error
final static int a=2;
//void show(){
//	
//}It is showing error remove final from void show method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(a);
//a=a; showing error here;
	}

}
 class TestFinal{
	final void show(){
		System.err.println("Final");
	}
}
