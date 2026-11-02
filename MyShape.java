 abstract class Shape{
	abstract void area();
	
}
 class Circle7 extends Shape{
	 void area() {
		 System.out.print("\n  AREA=pi*r*r");
	 }
 }
abstract class Triangle4 extends Shape{
	 void area() {
		 System.out.print("\n AREA=0.5*base*height");
	 
	 }
	abstract void volume(); 
		 
}
 class Cone extends Triangle4{
	 void volume() {
		
	 System.out.print("\n AREA =pie*r*r*height/3");
   }
 }
public class MyShape {

	public static void main(String[] args) {
		
		Circle7 c1=new Circle7();
		System.out.print("\n \n CIRCLE :");
		c1.area();
		
		Cone c2=new Cone();
		System.out.print("\n\n CONE : ");
		c2.volume();

	}

}
