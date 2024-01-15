package session_7;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListDemo {
      public static void main(String[] args) {
    	  LinkedList<String> l=new LinkedList();
//    	  l.add("Abhishek");
//    	  l.add(3);
//    	  l.add(6.7);
//    	  System.out.println(l);
//    	  l.set(0, "Jadhav");
//    	  System.out.println(l);
//    	  l.removeLast();
//    	  System.out.println(l);
//    	  l.add(0,3);
//    	  System.out.println(l);
//    	  System.out.println(l instanceof Serializable);
    	 
    	  l.add("Abhishek");
    	  l.add("Subhash");
    	  l.add("Rekha");
    	  l.add("Jadhav");
    	 ListIterator<String> itr=l.listIterator();
    	 while(itr.hasNext()) {
    		 String str =itr.next();
    		 if (str.equals("Rekha")) {
    			 itr.set("mummy");
    		 }		
    	 }
    	  
    	  System.out.println(l);
 
    	  while(itr.hasNext()) {
     		 String str =itr.next();
     		 if (str.equals("Rekha")) {
     			 itr.set("Laxmi");
     		 }		
     	 }
     	  
     	  System.out.println(l);
	}
      
}
