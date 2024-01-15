import java.security.DomainCombiner;

public class Employee {
     int empId;
     String empName;
     public Employee() {}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public boolean equals(Object obj) {
		Employee e= (Employee)obj;
		if (this.empId==e.empId && this.empName.equals(e.empName)) {
			return true;
		}
		else {
			return false;
		}
		

	}
	public static void main(String[] args) {
		Employee e1=new Employee(101,"abhi");
		Employee e2=new Employee(101,"abhi");
		if(e1.equals(e2)) {
			System.out.println("are equal");
		}
		else {
			System.out.println("are not equal");
		}
		
		System.out.println("e1= "+e1.hashCode());
		System.out.println("e2= "+e2.hashCode());
	}
    
	
     
}

//when you going to inherit class you need to explicitly implement default constructor of parent class
//object class has method eqauls() which is use to check if two objects are equal or not (state of objects are equal or not
//you need to override this method for defining it for checking if states are equal

// instanceof  operator is use to check if the present instance is of that class or not 
// also for checking its type
