import java.util.Scanner;

class NegativeAmountException extends Exception {
	double salary;
	NegativeAmountException(double s){
		salary=s;
	}
	
	public String toString() {
	     return "\n NEGATIVE AMOUNT :"+salary+"HAS BEEN CAUGHT";	
	}
		
}		



public class CustomException {

	public static void main(String[] args) {
		double salary;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("\n Salary");
		salary=scan.nextDouble();
		try {
		if(salary<0) 
		{
			throw new NegativeAmountException(salary);
		}
		else
			
		{
			System.out.print("\n GO GOA ");
		}
	}
		
		catch(NegativeAmountException ne)
		{
			System.out.print(ne);
		}
     
    }
}