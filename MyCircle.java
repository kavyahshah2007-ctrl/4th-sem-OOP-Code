import java.util.Scanner;

class Circle{
	float r,area;
	Scanner scan=new Scanner(System.in);

 void input() {
		System.out.print("\n ENTER RADIUS");
		r=scan.nextInt();
	}
	
	void output() {
		System.out.print("\n THE RADIUS IS"+r);
		area=3.14f*r*r;
		System.out.print("\n  AREA "+area);
	}
	}



public class MyCircle {

	public static void main(String[] args) {
	
		Circle c1=new Circle();
		Circle c2=new Circle();
		
		c1.input();
		c2.input();
		
		
		c1.output();
		c2.output();

	}

}
