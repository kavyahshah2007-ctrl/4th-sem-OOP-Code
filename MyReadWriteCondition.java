class call{
	void read(String sa) {
		System.out.print("\n  "+sa+"Has Started reading");
		try 
		{
			Thread.sleep(4000);
		}
		catch(Exception e) 
		{
			
		}
		System.out.print("\n  "+sa+"Has Finished reading");
	}

	/*synchronized void edit(String aa) {
		System.out.print("\n "+aa+"HAS EDITED ");
		try 
		{
			Thread.sleep(4000);
		}
		catch(Exception e) 
		{
			
		}
	}
}*/
      void edit(String aa) {
	System.out.print("\n "+aa+"HAS EDITED ");
	try 
	{
		Thread.sleep(4000);
	}
	catch(Exception e) 
	{
		
	}
	System.out.print("\n  "+aa+"Has Finished EDITED");
}
}
	
	class Syncchild implements Runnable{
		Thread th;
		call c;
		String na;
		Syncchild(String na,call cc){
			th=new Thread(this);
			c=cc;
			this.na=na;
			th.start();
		}
	/*public void run() {
		c.read(na);
		c.edit(na);
	}*/
		public void run() {
		c.read(na);
		if(na.equals("SUPER"))
		{
			c.edit(na);
		}
		else {
		synchronized(c)
		{
			c.edit(na);	
		}
		
	}
 }
			
	
}

public class MyReadWriteCondition {

	public static void main(String[] args) {
		call c=new call();
		Syncchild c1=new Syncchild("KAVYA",c);
		Syncchild c2=new Syncchild("MANAV",c);
		Syncchild c3=new Syncchild("Preet",c);
		Syncchild c4=new Syncchild("SUPER",c);

	}

}
