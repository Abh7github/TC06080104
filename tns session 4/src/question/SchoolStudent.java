package question;
;

public class SchoolStudent extends Student {
    private String className;

    public SchoolStudent() {}
	public SchoolStudent(int roll,float perc,String className) {
		super(roll,perc);
		this.className = className;
	}
    public void show() {
    	super.show();
    	System.out.println("Class Name: "+className);
    }
    
}
