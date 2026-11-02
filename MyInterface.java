 class Veh{
	int wheels;
	int capacity;
	
	Veh(int wheels,int capacity){
		this.wheels=wheels;
		this.capacity=capacity;
	}
	
	 void show() {
		 System.out.print("\n WHEELS ="+wheels);
		 System.out.print("\n CAPACITY ="+capacity);
	 }

}
 
 
interface speed {
	int sp =1500;
	void spe();
}

interface fly extends speed{
	int height=15000;
	void display();
}

interface loading{
	int weight=20000;
	void we();
}

class Aeroplane extends Veh  implements fly,loading,speed{
	int airhostess;
	Aeroplane(int wheels,int capacity,int airhostess){
		super(wheels,capacity);
		this.airhostess=airhostess;
	}
	
	void output() {
		System.out.print("\n AIRHOSTESS="+airhostess);
	}

 public void spe() {
	System.out.print("\n SPEED="+sp); 
 }
 public void we() {
	 System.out.print("\n WEIGHT="+weight);
 }
 public void display()
 {
	 System.out.print("\n HEIGHT="+height);
 }
 
 void disp()
 {
	 show();
	 output();
	 spe();
	 we();
	 display();
	 
	 
 }
  
}
public class MyInterface {

	public static void main(String[] args) {
		Aeroplane p1=new Aeroplane(4,6,8);
		p1.disp();

	}

}
