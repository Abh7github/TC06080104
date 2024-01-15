
public class Employee implements Cloneable {
	
	private int empID;
	private String empName;
	
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e=new Employee(111, "Abhishek");
	    Employee e2= (Employee) e.clone();
	    System.out.println(e2);
	}
 
}




/*A enum is type whose fields consists of fixed set of constants 
 * created using keyword enum
 * it is kind of class definition 
 * 
 * thew possible values are listed in curly braces ,deperated by commas
 * by convention the value names are in upper case
 * 
 * java.lang.Enum is a abstract class
 * 
 * by default the constants in the enumeration are assigned with the integer value 0,1,2,3 and so on .
 */
 
