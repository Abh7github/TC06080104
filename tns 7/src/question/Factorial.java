package question;

public class Factorial extends Processor {
	int data=5;
	public  int process()
	{
		int fact=1;
		for (int i=1;i<=data;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
	    
		Factorial f=new Factorial();
		System.out.println(f.process());
	}
}

/* Explain the importance of toString() and eqauls() method of the object class and ovveride  them on class Employee(empId,name,Salary) for main method .and accept five
and store in array also insured if entered employee id is exist or not (use equal method ) 
display all employee info using toString method
 * 
 */
