import java.util.Scanner;

class PowerFact implements Runnable
{
	int no,x,n,p=1,f=1,flag;
	Thread th;
	
	PowerFact(int no)
	{
		th=new Thread(this);  
		
		this.no=no;
		flag=1;
		th.start();
	}
	PowerFact(int x,int n)
	{
		th=new Thread(this);
		this.x = x;
		this.n = n;
		flag=2;
		th.start();		
	}
	
	public void run()
	{
		if(flag==1)
		{
			while(no>=1)
			{
				f=f*no;
				no--;
			}
			System.out.print("\n FACTORIAL = "+f);
		}
		else if(flag==2)
		{
			int i=1;
			while(i<=n)
			{
				p=p*x;
				i++;
			}
			System.out.print("\n POWER = "+p);
		}
		
		
	}
	
	
}

public class MyThread4{

	public static void main(String[] args) {
		
		int no,x,n;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n ENTER NO : ");
		no=scan.nextInt();
		System.out.print("\n ENTER 2 NOS FOR POWER : ");
		x=scan.nextInt();
		n=scan.nextInt();
		
		PowerFact p1 = new PowerFact(no);
		PowerFact p2 = new PowerFact(x,n);
				

	}

}