package oops.keywords;



public class ThisKeywod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyword obj=new Keyword();
		System.out.println("before1:"+obj.getData());
		obj.setData(20);
		System.out.println("after1:"+obj.getData());
		obj.setDataWithThis(20);
		System.out.println("after2:"+obj.getData());
	}

}

class  Keyword{
	
	int a;
	void setData(int a) {
	a=a;	
	}
	void setDataWithThis(int a) {
		this.a=a;	
		}
	public int getData() {
		return a;
	}
}
class  ThisKeyword{
	
	
}
