package oops.exceptionall;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		if(age<18) {
			throw new  YoungerAge("Not permitted for vote");
		}else {
			System.out.println("Go for voting Good Luck!");
		}
	}
	

}
class YoungerAge extends RuntimeException{
	
	YoungerAge(String msg){
		
	super(msg);
	}
}
