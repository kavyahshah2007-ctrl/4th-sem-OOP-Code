class ChildTh implements Runnable
{
	int j;
	Thread th;
	
	ChildTh()
	{
		th = new Thread(this);
		j=1;
		th.start();
	}
	
	public void run()
	{
		
		for(j=10;j>=1;j--)
		{
			System.out.print("\n        CHILD  = "+j);
			try { Thread.sleep(500); }
			catch(Exception e)
			{}
		}
	}
	
	
}


public class MyThread {

	public static void main(String[] args) {

		ChildTh c1 = new ChildTh();
		ChildTh c2 = new ChildTh();
		
		int i;
		Thread th = Thread.currentThread();
		System.out.print("\n NAME = "+th.getName());
		th.setName("SVIT");
		System.out.print("\n NAME = "+th.getName());
		
		System.out.print("\n\n CHILD1 IS ALIVE = "+c1.th.isAlive());
		System.out.print("\n\n CHILD2 IS ALIVE = "+c2.th.isAlive());
		System.out.print("\n\n MAIN IS ALIVE = "+th.isAlive());

		for(i=1;i<=10;i++)
		{
			System.out.print("\n  MAIN = "+i);
			try { Thread.sleep(1000); }
			catch(Exception e)
			{ }
		}

		System.out.print("\n\n CHILD1 IS ALIVE = "+c1.th.isAlive());
		System.out.print("\n\n CHILD2 IS ALIVE = "+c2.th.isAlive());
		System.out.print("\n\n MAIN IS ALIVE = "+th.isAlive());

	}

}