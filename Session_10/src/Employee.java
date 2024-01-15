
public class Employee {
	private int empID;
	private String empName;
	private float empSal;
	
	public Employee() {
		System.out.println("Default constructor Invoked");
	}
	
	public Employee(int empId,String empName,float empSal) {
		System.out.println("parametrized constructor invoked");
		this.empID=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public String toString() {
		return "Employee = ["+empID+" "+empName+" "+empSal+"]" ;
	}
	
	
	public static void main(String args[]) {
		Employee e=new Employee(10,"Abhishek",100000.45f);
		System.out.println(e);
	}

}




//there are four access modifiers in java
//1.Default ,  2. Private  ,  3.Protected  ,  4.Public
//private modifier can allow access only within class 
//
