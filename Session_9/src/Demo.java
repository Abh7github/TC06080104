
public class Demo {
	
	public static void getMsg() {
		msg();
	}
	
	
	public static float msg() {
		return(10/0);
	}
	
	public static void main(String[] args) {
		Demo.getMsg();
	}

}








//data or logical errors= run time  errors
//syntatical errors = compile time errors
//errors are inevitabel 

//error can be shipped with the best software
//exception is an abnormal condition 
//mechanism to handle run time errors so that the normal flow of application be maintained

//checked exception are called as compile time exception  eg , FileNotFounExdception , IOException 
//unchecked exception are called as runtime exception 
//checked exception are outside of jvm   eg, ArrayIndexOutOfBoundsException,NullPointerException
//uncheked exception are inside of jvm


// if exceptions are not handled then jvm describe the exception , gives location on stack frame and terminates the program
//if exception are handled with user freindly message then rest of code is executed.

//always put buisness logic in try 





//At every method call to stack frame one activation record is created 
// and is deleteed after the method completion


// Default exception handling has a format like this way :

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at Demo.msg(Demo.java:10)
//at Demo.getMsg(Demo.java:5)
//at Demo.main(Demo.java:14)
