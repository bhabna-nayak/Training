
public class Demo2 implements Runnable {
	  public static int myCount = 0;
	    public Demo2() {
	    	
	    }

	    public void run() {
	        while(Demo2.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++Demo2.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Starting Main Thread...");
	        Demo2 d = new  Demo2();
	        Thread t = new Thread(d);
	        t.start();
	        while( Demo2.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++ Demo2.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");

	}

}
