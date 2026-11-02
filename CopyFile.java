import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
	   
		String fna,cna;
		Scanner scan =new Scanner(System.in);
		System.out.print("ENTER FILE1 :");
		fna=scan.next();
		System.out.print("ENYER FILE2 :");
		cna=scan.next();
		
		try 
		{
			FileReader fr= new FileReader("src//"+fna);
			BufferedReader br=new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("src//"+cna);
			
			String line="";
			int l=0;
			
		
		
		while(line!=null)
		{
			line = br.readLine();
			
			if(line!=null)
			{
				fw.write(line+"\n");
				l++;
			}
		}
		
         fr.close();
         fw.close();
         
         System.out.print("\n FILE COPIED----");
         System.out.print("\n Count file"+l);
         
	}
	
	catch(Exception e)
	{
		
	}

}
}
