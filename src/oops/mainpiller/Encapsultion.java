package oops.mainpiller;

public class Encapsultion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsultionCheck obj=new EncapsultionCheck();
		System.out.println("before:"+obj.getEmpId());
		obj.setEmpId(20);
		System.out.println("after:"+obj.getEmpId());
		
	}

}
class EncapsultionCheck{
	private int empId;
	
	public void setEmpId(int empIds) {
		empId=empIds;
	}
	public int getEmpId() {
		return empId;
	}
}
