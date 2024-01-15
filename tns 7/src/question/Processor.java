package question;

public abstract class Processor {
      protected int data;
      protected void showData() {
    	  System.out.println("Data: "+data);
      }
      public abstract int process();
}
