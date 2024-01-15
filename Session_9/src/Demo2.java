import java.io.*;
public class Demo2 {
     public static void main(String[] args) throws IOException {
		FileOutputStream fos =null;
		
		try {
			System.out.println("In try");
			fos = new FileOutputStream("c://mno.txt",true);
			String str= "JSPM engineering College";
			byte b[]=str.getBytes();
			fos.write(b);
		}catch(Exception e) {
			System.out.println("In catch");
			System.out.println(e);
		}finally {
			System.out.println("In finally");
			fos.close();
		}
	}
}
