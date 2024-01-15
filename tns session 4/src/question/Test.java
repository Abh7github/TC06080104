package question;
import java.util.Scanner;
public class Test {
       public static void main(String[] args) {
    	   int roll;
		Student array[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			if(i<2) {
				array[i]=new SchoolStudent(sc.nextInt(),sc.nextFloat(),sc.next());
			}
			else {
				array[i]=new CollegeStudent(sc.nextInt(),sc.nextFloat(),sc.next());
			}
		}
		
		System.out.println("Enter the roll no you want to search:");
		roll=sc.nextInt();
		
	    for(int j =0 ; j<5;j++) {
	           if 
	    }
	    
		
	}
}
