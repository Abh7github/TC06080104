
public class Person {
     private String name;
     private int age;
     
     public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		age=18;
		this.name = name;
	}
     
	

	public void display() {
		System.out.println("Name : "+name+" , Age: "+age);
	}
    public static void main(String[] args) {
		Person p1=new Person("Abhishek",21);
		Person p2=new Person("Ajay");
		p1.display();
		p2.display();
	}
}



//array is collection of similar types of similar type of elements are stored in contigous memeory 
//arrays are first class objects in java
//actual array is created on heap
//arrays reference are stored on stack
//we store only fixed set of elements in java array
//array in java are indexed based
//array can be created using new keyword as well without new keyword (that is why it is first class)