package session_7;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
      public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		System.out.println(v.capacity());
		for(int i = 1;i<=21;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {                                                                
			int i=e.nextElement();
			
			if(i%2==0) {
				System.out.println(i);
			}
			else {
//				v.remove(i);
			}
		}
	}
}
