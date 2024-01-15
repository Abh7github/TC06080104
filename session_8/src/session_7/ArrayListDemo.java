package session_7;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	  int i;
      public static void main(String[] args) {
		List <Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(31);
		l.add(56);
//		System.out.println(l);
//		l.remove(1);
//		System.out.println(l);
//    	l.add(0,10);
//    	l.add(3,40);
//    	System.out.println(l);
//    	List l1=Collections.synchronizedList(l) ; //multiple threads cannot access this list simultaneously  
//    	System.out.println(l1);
    	Iterator<Integer> i=l.iterator();
    	while(i.hasNext()) {
    		int n=i.next();
    		if(n%2==0) {
    			System.out.println(n);
    		}
    		else {
    			i.remove();
    		}
    	}
    	System.out.println(l);
    	
	}
}

//memory point of view arrays are not recommended to use
//performance point of view arrays are recommended
//arrays can hold both primitive and object types
//there is no underlying structure for arrays and hence there is no ready made method support

//when collections are added in J2SE 1.2 ,the classes and interfaces that are previously use for storing the object
//are again re-engineered and are known as legacy classes

//in jdk5 all legacy classes are redesigned to support generics
//legacy classes are synchronized


//In collection framework the following legacy characters are there

/*
-Enumeration(I)
-Dictionary(AC)
-vector(c)
-stack(c)
-Hash Table(c)



Collections
:Collections are growable in nature 
:memory point of view they are recommended to use
:Performance point of view they are not recommnede to use
:Collectionss can also hold the hetrogenous data
:Collections can hold the object only not the primitive data type



collection framework

:in general we can consider the collection interface as root interface
:Collection in java is a framework that are has architecture which help in manipulating the object storing


                                     Collection
                                     
                         list          set              Queue
                         
                     arrayList                          priority queue
                                                        blocking queue
                                                        
                     Likedlist        hashset
                                      linkedhashset
                                      sorted set
                                      navigable set
                                      tree set

List interface:

child of collection interface
insertion order is preserved
duplicates are allowed
index plays very important role in list

ArrayList:

the underlying data structure is resizable array
arrayList is best choice for retrival operation


Linked list:

The underlying data structure is double linked list
for frequent insertion and deletion operation the linked list is perfect choice
it will be worse choice for retrieval operation
Duplicate objects are allowed
insertion order is preserved
null insertion is possible



*/

