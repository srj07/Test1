package oops;

public class EncapsulationJava {
	
	private String empName;
	private int SSN;
	private int empAge;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}
 
	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationJava ec = new EncapsulationJava();
		ec.setEmpName("15");
		ec.setEmpAge(28);
		ec.setSSN(14332535);
		
		System.out.println("Employee name"+ec.getEmpName());
		System.out.println("Employee Age"+ec.empAge);
		System.out.println("Employee Age"+ec.empAge);

		
		
		
	}

}
