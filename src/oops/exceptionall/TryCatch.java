package oops.exceptionall;

import java.io.FileInputStream;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("");
System.out.println(10/0);
		}catch(Exception ex) {
			System.out.print(ex.getMessage());
			System.out.println("You can not divide by Zero");

		}
		finally {
			System.out.println("I'm always here ");	
		}
		try {
			System.out.println("2nd try ");	
//System.out.println(10/0);
		}
		finally {
			System.out.println("I'm always here ");	
		}
	}

}
