package session_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
     public static void main(String[] args) throws IOException ,ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("C://abc.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		Student s =new Student();
		oos.writeObject(s);
		System.out.println("Success");
		
		oos.close();
		fos.close();
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("C://abc.txt"));
		Student s1=(Student)ois.readObject();
		System.out.println(s1);
		}
}
