import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class MyFileOutputStream {

	public static void main(String[] args) {
		
		String fna,cna;
        Scanner scan =new Scanner(System.in);
        
        System.out.print("ENTER FILE NAME:");
        fna=scan.next();
        
        System.out.print("ENTER FILE NAME:");
        cna=scan.next();
        
        
        
        
        	try
        	{
        		FileInputStream fis= new FileInputStream("src//"+fna);
        		FileOutputStream fos= new FileOutputStream("src//"+cna);
        		
        		int n=0;
        		
        		
        		while(n!=-1)
        		{
        			n=fis.read();
        			
        			fos.write(n);
        		}
        		fis.close();
        		fos.close();
        		System.out.print("\n File Copied------");
        	}
        	
        	catch(Exception e)
        	{ }
	}
        
}

