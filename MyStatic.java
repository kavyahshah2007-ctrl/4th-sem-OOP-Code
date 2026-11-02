class Bankk{
	int id;
	String name;
	static float rate;
	
	void show() {
		System.out.print("\n\n ID="+id);
		System.out.print("\n NAME="+name);
        System.out.print("\n RATE="+rate);	
	}
	static void display() {
		//System.out.print("\n ID="+id);
		//System.out.print("\n NAME="+name);
        System.out.print("\n RATE="+rate);	
	}
	
}
public class MyStatic {

	public static void main(String[] args) {
		Bankk b1=new Bankk();
		Bankk b2=new Bankk();
		Bankk b3=new Bankk();
		
		b1.id=101;
		b1.name="AAA";
		b1.rate=1.3f;
		
		b2.id=102;
		b2.name="BBB";
		b2.rate=1.4f;
		
		b3.id=103;
		b3.name="CCC";
		b3.rate=1.8f;
		
		b1.show();
		b2.show();
		b3.show();
		
		b1.display();
		b2.display();
		// Bankk.show();
		// normal member cant be accesed by class_name.
		
		Bankk.display();
		// static member can be accesed by class_name.
	}

}
