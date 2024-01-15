
public class D extends C{
	public D() {
		super(2);
		
		System.out.println("Default invoke");
	}
    public D(int a) {
    	super(2);
    	
    	System.out.println("child paremetrized");
    }
    public static void main(String[] args) {
		D d=new D();
		D p=new D(3);
		
	}
}



//adding super method will decide which parent constructor will invoke first
//constructor will be invoke whenever you create object of class 
//when class is final it cannot be inherited
//const keyword is there which is reserved