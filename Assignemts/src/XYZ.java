
public class XYZ {
       public static void main(String[] args) {
    	   PartTimeFaculty p1 =new PartTimeFaculty(100, 9, 500);
           PartTimeFaculty p2 =new PartTimeFaculty(101,10,400);
           FullTimeFaculty f1=new FullTimeFaculty(102, 5000, 5000);
           FullTimeFaculty f2=new FullTimeFaculty(103,4000,4000);
           p1.getPartTimeData();
           p2.getPartTimeData();
           f1.getFullTimeData();
           f2.getFullTimeData();
	}
       
}
