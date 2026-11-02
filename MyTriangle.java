
import java.util.Scanner;

class Triangle
{
	float base,height,area;
	Scanner scan = new Scanner(System.in);
	
	void input()
	{
		System.out.print("\n ENTER BASE : ");
		base = scan.nextFloat();
		System.out.print("\n ENTER HEIGHT : ");
		height=scan.nextFloat();
	}
	void show()
	{
		System.out.print("\n BASE = "+base);
		System.out.print("\n HEIGHT = "+height);
		area = .5f*base*height;
		System.out.print("\n    AREA  =  "+area);
	}	
}

public class MyTriangle {

	public static void main(String[] args) {

		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.input();
		t2.input();
		
		t1.show();
		t2.show();
		
		
	}

}
