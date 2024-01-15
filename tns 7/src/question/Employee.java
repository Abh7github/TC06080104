package question;
import java.util.Scanner;
public class Employee {
   int empId;
   String name;
   int salary;
   
   public Employee() {}
public Employee(int empId, String name, int salary) {

	this.empId = empId;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public boolean equals(Object obj) {
	Employee e =(Employee) obj;
	if ( this.name==e.name && this.salary==e.salary) {
		return true;
	}
	else {
		return false ;
	}
}
   
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee array[]= new Employee[5];
	for(int i =0 ; i<5;i++) {
		array[i]=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
	}
	for(int j=0;j<5;j++) {
		System.out.println(array[j]);
	}
	if(array[0].equals(array[1])) {
		System.out.println("Yes they are equal");
	}
	else {
		System.out.println("Not equal");
	}
}
   
}
