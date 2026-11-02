import java.io.File;

import java.io.FileInputStream;
import java.util.Scanner;
public class MyInputStream {

	public static void main(String[] args) {
		
		String fna;
        Scanner scan =new Scanner(System.in);
        
        System.out.print("ENTER FILE NAME:");
        fna=scan.next();
        
        File f=new File("src//"+fna);
        
        if(f.exists())
        {
        	try
        	{
        		FileInputStream fis= new FileInputStream("src//"+fna);
        		int n=0;
        		char ch=' ';
        		
        		while(n!=-1)
        		{
        			n=fis.read();
        			
        			ch=(char)n;
        			System.out.print(ch);
        			
        		}
        		fis.close();
        	}
        	
        	catch(Exception e)
        	{ }
	}
        else
        {
        	System.out.print("\n FILE DOES NOT EXIST");
        }
}
}