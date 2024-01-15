
public class B extends A {
	public B get() {
		return this;
	
	}
	
	void msg() {
		System.out.println("Hello world");
	}
     public static void main(String[] args) {
		new B().get().msg();
	}
}

