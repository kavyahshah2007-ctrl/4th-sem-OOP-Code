import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException1 {
	
	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		int a=0,b=0,i=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.print("\n Enter NO.1=");
		a=Integer.parseInt(br.readLine()); 
		

		System.out.print("\n Enter No.2=");
		b=Integer.parseInt(br.readLine()); 
		
		
			i=a/b;
			System.out.print("\n DIVISION OF TWO NOS."+i);
		
		}
		catch(NumberFormatException ne){
			System.out.print("\n "+ne.getMessage());
		}
		catch(ArithmeticException ae)
		{
			System.out.print("\n "+ae.getMessage());
		}
		
		Thread.sleep(3000);
		
		System.out.print("\n Emnjoy your day");
	}

}
