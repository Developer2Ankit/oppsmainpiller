package oops.keywords;

public class StaticMethod {
	StaticMethod(){
		 System.out.println("constructor");	
	}
 static void check() {
	 System.out.println("check01");
 }
  void show() {
	  System.out.println("check02"); 
  }
	public static void main(String[] args) {
		System.out.println("Main method");	
		StaticMethod obj=new StaticMethod();
		// TODO Auto-generated method stub
		//StaticMethod.check();
		check();
	}
static {
	System.out.println("static called");
}
}
