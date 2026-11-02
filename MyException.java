//WAP to enter 10 numbers in array and print its sum then again ask the user to enter element 
//and divide the sum by value of that element

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException {

	public static void main(String[] args) throws IOException
	
	{
		
		int a[] = new int[10];
		int i,s=0,e=0,d=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(i=0;i<a.length;i++)
		{
			
			
			try
			{
				System.out.print("ENTER NO."+(i+1)+" : ");
				a[i] = Integer.parseInt(br.readLine());
				s=s+a[i];
			}
			catch(NumberFormatException ne)
			{
				System.out.print("\n "+ne.getMessage());
				i--;
			}
		}
		
		System.out.print("\n SUM = "+s);
		
		int flag=0;
		
		while(flag==0)
		{
			
			try
			{
				System.out.print("\nENTER ELEMENT : ");
				e=Integer.parseInt(br.readLine());
				d=s/a[e-1];
				flag=1;
			}
			
			// catch(Exception e)
			//{  S.O.P("\n "+e.getMessage())  };
			
			catch(ArithmeticException ae)
			{
				System.out.print("\n "+ae.getMessage());
			}
			
			catch(NumberFormatException nf)
			{
				System.out.print("\n "+nf.getMessage());
			}
			
			catch(ArrayIndexOutOfBoundsException ai)
			{
				System.out.print("\n "+ai.getMessage());
			}
			
			finally
			{
				System.out.print("\nABC");
			}
		}
	
		System.out.print("\nDIVISION : "+d);
		System.out.print("\n\nHAVE A NICE DAY");
	}

}