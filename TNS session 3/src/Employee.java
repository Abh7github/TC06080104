
public class Employee {
     private int empId;
     private String empName;
     private Date dt_of_joining;
     public Employee() {}
	public Employee(int empId, String empName, Date dt_of_joining) {
		this.empId = empId;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}

	public String toString() {
		return "Employee [employee id ="+empId+" ,empname="+empName+" ,date of joining="+dt_of_joining;
		
	}
     
     public static void main(String[] args) {
		Employee e=new Employee(111,"Abhishek",new Date(19,10,2023));
		System.out.println(e);
		
	}
}
