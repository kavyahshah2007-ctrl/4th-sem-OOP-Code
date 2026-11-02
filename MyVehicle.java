class Vehicle{
	int wheels,capacity;
	
	Vehicle(int a,int b){
		wheels=a;
		capacity=b;
		
	}
	void show() {
		
		System.out.print("\n WHEELS="+wheels);
	    System.out.print("\n CAPACITY="+capacity);   
	}	
}

class Bike extends Vehicle{
	
	int stands;
	
	Bike(int a,int b,int c){
		super(a,b);
		stands=c;
	}
	
	void display() {
	
		System.out.print("\n\n BIKE ");
		show();
	
		System.out.print("\n STANDS="+stands);
	}
	
}

class Car extends Vehicle{
	int doors;
	
	Car(int a,int b,int d){
		super(a,b);
		doors=d;
	}
	
	void output() {
		
		System.out.print("\n\n CAR ");
		show();
		
		System.out.print("\n DOORS="+doors);
	}
}
class Plane extends Vehicle{
	int airhostess;
	
	Plane(int a,int b,int e){
      super(a,b);
      airhostess=e;
	
	}

	void print() {
        	
		System.out.print("\n\n PLANE ");
        show();
        
		System.out.print("\n AIRHOSTESS="+airhostess);
	}
}
public class MyVehicle {

	public static void main(String[] args) {
		Bike b1=new Bike(2,2,1);
		b1.display();
	
		
	  
		Car c1=new Car(4,5,4);
		c1.output();
		
		Plane p1=new Plane(6,150,4);
		p1.print();
	
	}
	

}
