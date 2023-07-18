package oops.mainpiller;

public class Animal {
String color;
int age;
	public void eat() {
		
		System.out.println("I am eating.");
	}
	public static void main(String[] args) {
    System.out.println("1");
    Animal object=new Animal();
    object.age=20;
    object.color="Red";
    object.eat();
	System.out.println(object.age+":"+object.color);
    Bird object2=new Bird();
    object2.fly();

	}

}
class Bird{
	public void fly(){
		System.out.println("Bird flying ");
	}
	
}