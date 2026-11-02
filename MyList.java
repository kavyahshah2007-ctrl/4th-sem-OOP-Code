import java.io.File;
import java.util.Scanner;

public class MyList {

	public static void main(String[] args) {
	  
		String loc,ext;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print(" ENTER LOCATION :");
		loc=scan.next();
		
		System.out.print("\n ENTER EXTENSION:");
		ext=scan.next();
		
		File f=new File(loc);
		
		String cont[] =f.list();
		
		for(int i=0;i<cont.length;i++) {
			if(cont[i].endsWith(ext)) {
				System.out.print("\n "+cont[i]);
				
			}
		}

	}

}
