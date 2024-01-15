
public class Date {
    private int d,m,y;
    public Date() {}
	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}
    // toString() method is of Object class and we are overrriding it here 
	public String toString() {
		return "Date [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
	
	public static void swap(Date d[]) {
		Date temp=d[0];
		d[0]=d[1];
		d[1]=temp;
	}
    
    public static void main(String[] args) {
//	    Date d1=new Date(20,10,2023);
//	    Date d2=new Date(22,11,2023);
	    Date d[]=new Date[2];
	    d[0]=new Date(20,10,2023);
	    d[1]=new Date(22,11,2022);
	    System.out.println("Before swapping----->");
	    System.out.println(d[0]);
	    System.out.println(d[1]);
	    Date.swap(d);
	    System.out.println("Before swapping----->");
	    System.out.println(d[0]);
	    System.out.println(d[1]);
	    
	}
}







