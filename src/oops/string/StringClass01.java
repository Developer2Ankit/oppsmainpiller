package oops.string;

public class StringClass01  extends SSt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("ankit");
System.out.println(s);
String s1=new String("ankit");
System.out.println(s1);
String s2=new String("ankit");
s2=s2.concat("ankit1");
System.out.println(s2);
String s3="ankit";
System.out.println(s3);
s3="myname";
System.out.println(s3);
SSt st=new SSt();
st.a=10;
st.methodC();
	}
	void methodC(){
		
	}
}
class SSt{
	void methodC() {
		System.out.println(a);
	}
	int a=0;
	int b=0;
}
