
public class Employee {
      static int empNo;
      private int salary;
      static int totalSalary ;
      
      

     
      public Employee(int salary) {
		this.salary = salary;
	     totalSalary+=salary;
	     empNo+=1;
	}


      static{
    	  empNo=60;
      }
      
      
      public static void main(String[] args) {
    	
		Employee e= new Employee(10000);
		Employee e2=new Employee(20000);
		Employee e3=new Employee(30000);
		Employee e4=new Employee(40000);
	
		System.out.println("Total number of ewmployees : "+Employee.empNo+" Total salary: "+Employee.totalSalary);
		
	}
}
