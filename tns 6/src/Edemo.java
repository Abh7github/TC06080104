
public class Edemo {
      public enum Coffee{SMALL(60),MEDIUM(70),LARGE(80);
    	  int price;
    	  Coffee(int price){
    		  this.price=price;
    	  }
         
    	  public int showPrice() {
    		  return price;
    	  }
      };
      
      public static void main(String[] args) {
		Coffee c= Coffee.LARGE;
		System.out.println(c+"  Rs."+c.showPrice());
	}
}
