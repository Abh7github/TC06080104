import java.util.Scanner;
import java.lang.Math;
public class MathOperation {
  private int x,y,R;
  public void init() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the values of x and y");
	  System.out.print("Enter the value of x= ");
	  this.x=sc.nextInt();
	  System.out.print("Enter the value of y= ");
	  this.y=sc.nextInt();

	  
  }
  public void add() {
	  System.out.print("Addition = ");
	  this.R=x+y;
	  
  }
  public void multiply() {
	  System.out.print("Multiplication = ");
	  this.R=x*y;
  }
  
  public void power() {
	  double X = (double) x;
	  double Y = (double) y;
	  double r= (double) R;
	  System.out.print("X to power y = ");
	  r=Math.pow(X,Y);
	  R=(int) r;
  }
  public void display() {
	  System.out.println(R);
  }
  
 public static void main(String[] args) {
	MathOperation m=new MathOperation();
	m.init();
	m.multiply();
	m.display();
	m.add();
	m.display();
	m.power();
	m.display();
	m.add();
	m.display();
	
}
}
