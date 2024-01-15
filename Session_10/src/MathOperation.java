import java.util.Scanner;
public class MathOperation {
     private int a,b,result;
     private float p,q,r;
     private int arr[];
  
     
     
     
     public void multiply(int a,int b) {
    	 this.a=a;
    	 this.b=b;
    	 result=this.a*this.b;
    	 System.out.println("Multiplication= "+result);
    	 
    	 
     }
     
     public void multiply(float p ,float q,float r) {
    	 this.p=p;
    	 this.q=q;
    	 this.r=r;
    	 float result=this.p*this.q*this.r;
    	 System.out.println("Multiplication= "+result);
    	 
     }
     
     public void multiply(int arr[]) {
    	 result=1;
    	 for(int i:arr) {
    		 this.result=this.result*i;
    	 }
    	 System.out.println("multiplication= "+result);
     }
     
     public static void main(String[] args) {
		MathOperation m=new MathOperation();
		int arr[]= {10,20,2,3,4};
		m.multiply(2,3);
		m.multiply(2.4f,3.3f,4.5f);
		m.multiply(arr);
		
	}
}
