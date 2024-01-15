
public class PartTimeFaculty extends Faculty {
        private int hour;
        private int rate;
		public PartTimeFaculty(int faculty_id,int hour, int rate) {
			
			this.hour = hour;
			this.rate = rate;
			this.salary=this.hour*this.rate;
			this.faculty_id=faculty_id;
		}
		public void getPartTimeData() {
			System.out.print(" Faculty_id:"+faculty_id+",");
			System.out.print(" Hour:"+hour+",");
			System.out.print(" Rate:"+rate+",");
			System.out.print(" Salary:"+salary);
			System.out.println("");
			
		}

		
        
        
}
