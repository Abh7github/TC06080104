
public class Demo1 {
   public static void main(String[] args) {
	try {
		int a , b ,c=0;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;
		System.out.println("Div= "+c);
//	} catch(ArithmeticException e) {
//		System.out.println("Denominaor should not be zero");
//		
//	}
//	catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("Enter at least 2 parameters");
//	}
//	catch(NumberFormatException e) {
//		System.out.println("Enter only integer data");
//	}
	}
	
	catch(Exception e) {
		if(e instanceof ArithmeticException) {
			System.out.println("Denominator cannot be zero");
		}
		else if(e instanceof ArrayIndexOutOfBoundsException) {
			System.out.println("Enter atleast two numbers");
		}
		else if (e instanceof NumberFormatException) {
			System.out.println("Enter only integer data");
		}
		else {
			System.out.println("Exception !!!");
		}
		}
	}
	
}
 // String Class 
// serialization
//Clone method of Object class
//multithreading 
//file handling
//JDBC