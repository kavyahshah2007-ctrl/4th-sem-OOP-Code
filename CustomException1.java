import java.util.Scanner;

class InvalidMarksException extends Exception{
	int marks;
	
	InvalidMarksException(int m){
		marks=m;
	}
	
	public String toString() {
		return "\n InvalidMarks  :"+ marks + " has been Caught";
	}
}
public class CustomException1 {

	public static void main(String[] args) {
		int marks;
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter marks of one subject");
		marks=scan.nextInt();
		
		try {
			if(marks<0 || marks>100)
			{
				throw new InvalidMarksException(marks);
			}
			
			else {
				System.out.print("valid marks exception");
			}
		}
		
		catch(InvalidMarksException ae) {
			System.out.print(ae);
		}
		
		

	}

}
