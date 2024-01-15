package question;

public class Student {
    private int roll_no;
    protected float perc;
    static int count;
    public Student() {}
	public Student(int roll_no, float perc) {
		super();
		this.roll_no = roll_no;
		this.perc = perc;
		if(perc>75.0f) {
			count+=1;
		}
	}
	
	public void show(){
		System.out.println("Roll no:"+roll_no+" Percentage="+perc);
	}
    
    
}

