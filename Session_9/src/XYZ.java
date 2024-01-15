
public class XYZ {
    private int pid;
    private int price;
    private int quantity;
	public XYZ(int pid, int price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public int getPid() {
		return pid;
	}


	public int getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}
	
	
  
	static int total(XYZ[] arr2) {
		int total1=0;
		for(int i=0;i<arr2.length;i++) {
		   total1=total1+arr2[i].getPrice()+arr2[i].getQuantity();
		}
		
		return total1;
	}

	public static void main(String[] args) {
	      XYZ e1 = new XYZ(1,200,2);
	      XYZ e2 = new XYZ(2,300,2);
	      XYZ e3 = new XYZ(3,100,2);
	      XYZ e4 = new XYZ(4,400,2);
	      XYZ e5 = new XYZ(5,200,2);
	      XYZ arr[]= {e1,e2,e3,e4,e5};
	      int max=0;
	      int id=0;
	      for(int i=0;i<arr.length;i++) {
	    	  if (arr[i].getPrice()>max){
	    		  max=arr[i].getPrice();
	    		  id=arr[i].getPid();
	    	  }
	      }
	      
	      System.out.println("max id = "+id);
	      System.out.println("Total = "+XYZ.total(arr));
	}
    
      
}




