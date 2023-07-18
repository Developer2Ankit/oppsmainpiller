package oops.keywords;

public class Static1 {

	static int i = 10;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//System.out.println(TestStatic.st);//alwayes it will be static other wise it will show error
		TestStatic obj = new TestStatic(1);
		obj.display();
		TestStatic obj2 = new TestStatic(2);
		obj2.display();
		TestStatic obj3 = new TestStatic(3);
		obj3.display();
	}

	void chec() {
		// static int j=10; //it is showing error
	}

}

class TestStatic {
	int empNo;
	static String countryName = "India";
	TestStatic(int empno) {
		this.empNo = empno;
	}

	void display() {
		System.out.println("empNo:" + this.empNo + " Country: " + this.countryName);
	}

	

}
