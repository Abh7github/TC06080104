import java.util.Scanner;



 class Student {
	private int roll_no;
	private String name;
	private int m1,m2,m3;
	
    public Student() {}
    
    
	public int getRoll_no() {
		return roll_no;
	}

    public String get_name() {
    	return name;

	

	
	}

	public int getM1() {
		return m1;
	}


	public int getM2() {
		return m2;
	}


	public int getM3() {
		return m3;
	}


	public Student(int rollno, String name,int m1 ,int m2,int m3) {
		this.roll_no=rollno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	
	public String toString() {
		return "Student Name="+name+", Roll N0= "+roll_no;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students= ");
		int size=sc.nextInt();
		Student s[]=new Student[size];
		System.out.println("Enter the name of students , roll no and marks :");
		for(int i=0;i<size;i++) {
			s[i]=new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
	    for(int j=0;j<size;j++) {
	    	System.out.println("Name= "+s[j].get_name()+", Roll no= "+s[j].getRoll_no()+" marks of all subject=");
	    	System.out.println(s[j].getM1()+","+s[j].getM2()+","+s[j].getM3());
	    }
	}

}


//static block called before main method
//static members got memory in class area of heap memory
//you cannot use this keyword with static members
//all instance share the static members
//any change in static member makes effect for all instances
//static members belongs to the class rather than instance of the class
//static blocks are used to intialize the static members from class

 
//object class is a super class to all the classes you build
 //in method overriding the return type of program should be same
 //if you create the reference of super class suppose A and store the object of subclass b ,then 
 //for calling subclass specific method you need to down cast the refrence to the subclass refrence
 
 
 