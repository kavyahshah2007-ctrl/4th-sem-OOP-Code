abstract class Gym{
	abstract void price();
}
class Yearly extends Gym{
	void price() {

	System.out.print("\n PRICE OF YEARLY="+12000);
 }
}
abstract class Personal extends Gym{
	void price() {
		System.out.print("\n PRICE OF PERSONAL ="+20000);
	}
	abstract void other();
}
 class Lifetime extends Gym{
	void price() {
	System.out.print("\n PRICE OF LIFETIME ="+100000);	
	
	}
}
  class Premium extends Personal{
	 void other(){
	    price();
		 System.out.print(" \n ZUMBA \n YOGA");
	 }
 }
public class MyGym {

	public static void main(String[] args) {
		Yearly y1=new Yearly();
		System.out.print("\n YEARLY");
		y1.price();
        Lifetime l1=new Lifetime();
        System.out.print("\n LIFETIME");
        l1.price();
        
        
        Premium p1=new Premium();
        System.out.print("\n PREMIUM ");
        p1.other();
        		
	}

}
