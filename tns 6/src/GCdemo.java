
public class GCdemo {
        protected void finalize() throws Throwable {
        	System.out.println("finalize invoke");
        	
        }
        
        public static void main(String args[]) {
        	GCdemo g=new GCdemo();
        	g=null;
        	
        	System.gc();        	
        }
}

