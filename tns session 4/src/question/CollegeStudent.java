package question;

public class CollegeStudent extends Student {
      protected String semester;
      
     public CollegeStudent() {}

	public CollegeStudent(int roll,float perc,String semester) {
		super(roll,perc);
		this.semester = semester;
	}
     
	public void show() {
		super.show();
		System.out.println("Semester: "+semester);
	}
      
}
