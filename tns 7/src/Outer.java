
public class Outer  {
      private int no=10;
      static int a=2;
      
        class Inner{
    	  int no=1000;
    	  public void getNo() {
    		  int no=20;
    		  
    		  System.out.println("No="+no);
    		  System.out.println("NO="+this.no);
    		  System.out.println("NO="+a);
    	  }
    	  
      }
   
      
//      public void get() {
//    	  class Inner{
//    		  public void get_no(){
//    			  int roll=10;
//    			  System.out.println("No :"+roll);
//    			  
//    		  }
//    	  }
//    	  Inner i =new Inner();
//    	  i.get_no();
//      }
        
        
      
      public static void main(String[] args) {
	     //Outer o=new Outer();
         //Outer.Inner b=new Outer.Inner();
          //b.getNo();
    	  Inner i =new Outer().new Inner();
    	  i.getNo();
  
      }
}
//static class can only access the static memebers of outer class 