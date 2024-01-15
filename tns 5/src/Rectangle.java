
public class Rectangle extends Shape {
       
	private int l,b;

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	public float area() {
		return (l*b);
	}
}
