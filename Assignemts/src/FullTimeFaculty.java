
public class FullTimeFaculty extends Faculty {
        private int basic;
        private int allowance;
		public FullTimeFaculty(int faculty_id,int basic, int allowance) {
			
			this.basic = basic;
			this.allowance = allowance;
			this.salary=this.basic+this.allowance;
			this.faculty_id=faculty_id;
		}
		public void getFullTimeData() {
			System.out.print(" Faculty_id:"+faculty_id+",");
			System.out.print(" Basic:"+basic+",");
			System.out.print(" Allowance:"+allowance+",");
			System.out.print(" Salary:"+salary);
			System.out.println(" ");
			
		}

		
        
        
}
