package session_7;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int rollNo;
	private String Name;
	private transient float fees;
	public Student() {}
	
	public Student(int rollNo, String name, float fees) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.fees = fees;
	}
	
	public String toString() {
		return "["+rollNo+","+Name+","+fees+"]";
	}

}

/*
persisting the state of an object is caaled as serialization

*/