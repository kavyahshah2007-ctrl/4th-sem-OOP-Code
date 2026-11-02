import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MyFileWordReplace {

	public static void main(String[] args) {
	   
		String fna,name1,name2;
		
		Scanner scan =new Scanner(System.in);
		System.out.print("ENTER FILE1 :");
		fna=scan.next();
		
		
		System.out.print("ENTER WORD 1 :");
		name1=scan.next();
		System.out.print("ENTER WORD 2 :");
		name2=scan.next();
		
		
		try 
		{
			FileReader fr= new FileReader("src//"+fna);
			BufferedReader br=new BufferedReader(fr);
			
			
			String line="",data="";
			
		
		while(line!=null)
		{
			line = br.readLine();
			if(line!=null)
			{
			data=data+line+"\n";
			}
		}
		
         fr.close();
         
         
        data=data.replace(name1, name2);
        
       FileWriter fw =new FileWriter("src\\"+fna);
       fw.write(data);
       fw.close();
       }
		
	
	
	catch(Exception e)
	{
		
	}

}
}




