import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MyFileWord {

	public static void main(String[] args) {
	   
		String fna,name;
		
		Scanner scan =new Scanner(System.in);
		System.out.print("ENTER FILE1 :");
		fna=scan.next();
		System.out.print("ENYER FILE2 :");
		name=scan.next();
		
		try 
		{
			FileReader fr= new FileReader("src//"+fna);
			BufferedReader br=new BufferedReader(fr);
			
			
			
			String line="";
			
		
		while(line!=null)
		{
			line = br.readLine();
			if(line!=null) 
			{
			
			if(line.contains(name))
			{
				System.out.print("\n"+line);
			}
		}
		
         fr.close();
         
         
         System.out.print("\n FILE COPIED----");
         
         
		}
		}
	
	catch(Exception e)
	{
		
	}

}
}



