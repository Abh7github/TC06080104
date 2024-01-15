
public class Test2 {
     public static void main(String[] args) {
	   A1 a =new A1();
	   double d=a.div(2, 5);
	   if(d<1) {
		   try {
			   throw new MyException();
		   }
		   catch(MyException e) {
			   System.out.println(e);
		   }
		   
	   }
	   else {
		   System.out.println("d= "+d);
	   }
	}
}

//ARM is automatic resource management 