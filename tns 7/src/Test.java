
public class Test extends Outer{
      public static void main(String[] args) {
		Popcorn p= new Popcorn(){
			public void taste() {
				System.out.println("Cheesy");
			}
		};
		p.taste();
	}
}
