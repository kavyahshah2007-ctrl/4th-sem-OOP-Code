class ChildThread implements Runnable
{
	int i;
	char ch;
	Thread th;
	
	
	ChildThread(char ch)
	{
		th=new Thread(this);
		this.ch=ch;
		
		th.start();
	}
	
	public void run() 
	{
		for(char i=ch;i<ch+26;i++) 
		{
			System.out.print("\n CHILD"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
				
		}
	}
}

public class MyThread3 
{

	public static void main(String[] args) 
	{
		ChildThread
		
		
		c1=new ChildThread('a');
		try {
			c1.th.join();
		}
		catch(Exception e)
		{}
		
		ChildThread c2=new ChildThread('A');
		try {
			c1.th.join();
		}
		catch(Exception e)
		{}
			
			

	}

}

