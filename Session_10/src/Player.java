
public class Player {
	private String Country;
	private String Player_Name;
        public Player() {
        	Country="India";
        	
        }
        public Player(String Player_name) {
        	this();
        	this.Player_Name=Player_name;
        }
        
        public String toString() {
        	return "[Country="+Country+"  Player="+Player_Name+"]";
        }
        
        public static void main(String args[]) {
        	Player p=new Player("Dhoni");
        	System.out.println(p);
        	
        }
}

//by default lang package imported
//finally , final , finalized 
//final class cannot be inherited;
//final data memeber cannot be reintialized
//final method cannot be overriden
//out is static member of System class and its type is PrintStream i.e out is a reference variable
//for PrintStream class
//println() is method of class PrintStream


//PrintStream err
//printStram in

//can you declare class as private protected