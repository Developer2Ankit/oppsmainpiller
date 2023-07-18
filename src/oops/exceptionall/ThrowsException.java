package oops.exceptionall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		saveFile();
		FileInputStream fis=new FileInputStream("");
		System.out.println("Hello");
	}
	static void saveFile() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("");
	}

}
