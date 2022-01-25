
public class Demo1 extends Thread {
	public void run() {
		System.out.println("concurrent thread started running..");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d = new  Demo1();
  		d.start();

	}

}
