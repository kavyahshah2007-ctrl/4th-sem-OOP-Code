
import java.io.File;
import java.util.Scanner;

public class MyFile{

	public static void main(String[] args) {
	  
		String loc;
		int fi=0,fo=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print(" ENTER LOCATION :");
		loc=scan.next();
		
		
		
		File f=new File(loc);
		
		String cont[] =f.list();
		
		for(int i=0;i<cont.length;i++)
		{
			 File ff=new File(loc,cont[i]);
			 if(ff.isFile())
			 {
			    fi++;	 
			}
			else {
				fo++;
			}
		}
		
		System.out.print("\n files: "+fi);
		System.out.print("\n  folders:"+fo);


	}

}
