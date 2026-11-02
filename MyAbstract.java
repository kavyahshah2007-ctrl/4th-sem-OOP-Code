abstract class Vehicle7
{
	abstract void capacity();
	abstract void noofwheels();
	
}
class Bike7 extends Vehicle7
{
	void capacity() 
	{
		noofwheels();
		System.out.print("\n CAPACITY:"+2);
	}
	
	void noofwheels() {
		System.out.print("\n WHEELS:"+2);
	}
}
abstract class car7 extends Vehicle7{
	void noofwheels() {
		System.out.print("\n WHEELS:"+4);
	}
}
class Safari extends car7{
	
	void capacity() {
		noofwheels();
		System.out.print("\n CAPACITY :"+7);
	}
}
public class MyAbstract {

	public static void main(String[] args) {
	  car7 c;//abstract class have ref. variable
	  //c=new car7(); abstract class can't have object
	  
		
	  Bike7 b1=new Bike7();
	  System.out.print("\n\n BIKE :");
      b1.capacity();
      
      Safari s1=new Safari();
      System.out.print("\n\n SAFARI :");
      s1.capacity();
	}
}
