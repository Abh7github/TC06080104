
public class Demo {
	
}
 //instanceof operator 
/*
 * instanceof operator use for identifying the dynsmic data type of the object
 *- to acces the objects polymorphically
 *-java runtime keeps track of the class to which each object belongs to
 *
 *this information usd by the java to select the correct method for execution 
 *
 *
 */

/* Covariant return types
 * 
 * in method overrriding ,ovveriden method in subclass should have signature same as that of the parent class
 * 
 * in java 5 return type in overriden method can be changed as long as new return type is subtype of declared type.
 *  */
 
 
 
 
 /*
  * methods of object class
  * 
  * 1. String toString()......... return string representation of object
  * 
  * 2.void finalize()..........called by garbage collector on object when garbage collector determine there is no refrence of object is there
  * 
  * 3.boolean equals()..........indicate whether some other object is equal to this one
  * 
  * 4.object clone().............creates and returns a copy of this object
  * 
  * 5.int hashcode()................return  hascode value for the object
  * 
  * 6.class<?> getclass().............return the runtime class of the object
  * 
  * 7 void wait()............................cause the current thread to wait until another thread invkoes the notify() or notifyAll() for the object
  * 
  * 8.void notify ..................wakes up a single thread 
  * 
  * 9. void notifyAll()  .........wakes up all thread
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * Abstract class:
  * 
  * A class which contains generic features that multiple derived classes can share 
  * it contain abstract as well as non abstract methods 
  * 
  * A abstract method do not have implementation 
  * implementation is left to inheriting sub classes
  * cannot be instantiated
  * if class have only one method that is also a abstract method then class need to be abstract asS well as.
  * one can create refrence and therefore these classes can follows polymorphism 
  * 
  * static modifieres cannot be used with abstract clasees
  * 
  * constructor cannot be abstract
  */









 