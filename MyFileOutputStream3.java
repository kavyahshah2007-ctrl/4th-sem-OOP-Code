import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class MyFileOutputStream3{

	public static void main(String[] args) {
		
		String fna,cna;
        Scanner scan =new Scanner(System.in);
        
        System.out.print("ENTER FILE NAME:");
        fna=scan.next();
        
        
       
        	try
        	{
        		FileInputStream fis= new FileInputStream("src//"+fna);
        		
        		
        		int n=0,u=0,l=0,s=0,sp=0;
        		
        		
        		while(n!=-1)
        		{
        			n=fis.read();
        			
        			if(n>=65 && n<=90) 
        			{
        			  u++;
        			}
        			else if(n>=97 && n<=122)
        			{
        				l++;
        			}
        			else if(n>=48 && n<=57)
        			{
        				s++;
        			}
        			else
        			{
        				sp++;
        			}
        	
        		}
        		fis.close();
  
        		System.out.print("\n File Copied------");
        		
         		System.out.print("\n UPPER"+u);
         		System.out.print("\n LOWER"+l);
         		System.out.print("\n SPACE"+s);
         		System.out.print("\n SPECIAL CHARACTER"+sp);
         		
        	}
        	
        	catch(Exception e)
        	{ }
        	
        	
        	}
	
}


