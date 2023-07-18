package oops.exceptionall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis=new FileInputStream("");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
// in this compiler forced us to add try catch means it is checked exception.
