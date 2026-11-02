class Childthread implements Runnable{
	int i;
	int s;
	Thread th;
	
	Childthread(int s){
		th=new Thread(this);
		i=1;
		this.s=s;
		th.start();
	}
	public void run() {
		for(i=s;i<s+10;i++) {
			System.out.print("\n CHILD"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class MyThread2 {

	public static void main(String[] args) {
		Childthread c1=new Childthread(1);
		try {
			c1.th.join();
		}
		catch(Exception e){
			
		}
		Childthread c2=new Childthread(11);
		try {
			c2.th.join();
		}
		catch(Exception e){
			
		}
		Childthread c3=new Childthread(21);

	}

}
