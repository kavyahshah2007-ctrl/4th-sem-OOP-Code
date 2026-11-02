import java.util.Scanner;

class WrongGenderException extends Exception{
	String gender;
	
	WrongGenderException(String g){
		gender=g;
	}
	
	public String toString() {
		return gender+" is a Wrong gender input";
	}
}
public class CustomException2 {

	public static void main(String[] args) {
		String gender;
		String male="male";
	    String female="female";
		Scanner scan=new Scanner(System.in);
		System.out.print("\n ENTERED GENDER ");
		gender=scan.next();
		
		try {
			if(!gender.equals(male) && !gender.equals(female)) 
			{
				throw new WrongGenderException(gender);
			}
			else {
				System.out.print("\n valid Gender input");
			}
		}
		
		catch(WrongGenderException na)
		{
			
			
			
			
			System.out.print(na);
		}

	}

}
