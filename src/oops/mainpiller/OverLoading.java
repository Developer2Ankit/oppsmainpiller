package oops.mainpiller;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading obj=new OverLoading();
		obj.show();
		obj.show("Ankit");
		obj.main(12);
	}
void show() {
	System.out.println("You are in show");
}
void show (String name) {
	System.out.println("Name:"+name);
}
public static void main(int age) {
	System.out.println("Main:"+age);	
}
}
