package oops.keywords;

public class SuperKeyword extends SuperCheck{
int i=20;
void show(int i) {
	System.out.println(super.i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword obj=new SuperKeyword();
		
		obj.show(30);

	}

}
class SuperCheck{
	int i=10;
	
}
