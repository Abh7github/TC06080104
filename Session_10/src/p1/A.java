package p1;


public class A {
     public static int no =18;
     public static void getNo() {
    	 System.out.println("no="+no);
     }
     public static void main(String[] args) {
    	 A a=new A();
    	 A.getNo();
     }
}

// you can create sub package within package and import it using . operator
//if you import class from another package ,then only public members can be access
// if you want to acces static members from another class of another package then following syntax
//        import static package_name.static_members

//static import is a feature introduced in to the language version 5.0
//static members should define public to do so 
//if you want to extend the class by another class then you compulasary need to import it, no matter
//if you already imported the static memebers