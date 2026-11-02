class Boxx{
	int len,wid;
	Boxx(int len, int wid) //constructor overloading
	{
		this.len=len;
		this.wid=wid;
		
	}

	void show() {
		System.out.print("\n\n LENGTH="+len);
		System.out.print("\n WIDTH="+wid);
		System.out.print("\n    THIS   = "+this);
	}
	
	public String toString()
	{
		return "\n KAVYA "+len+" , "+wid;
	}
	
	protected void finalize()
	{
		
	}
	
}
public class MyBox2 {

	public static void main(String[] args) {
		Boxx b1 = new Boxx(10,20);
		Boxx b2 = new Boxx(5,20);
		Boxx b3 = new Boxx(100,200);
		
		b1.show();
		b2.show();
		b3.show();
		
		System.out.print("\n\n B1 = "+b1);
		System.out.print("\n\n B2 = "+b2);
		System.out.print("\n\n B3 = "+b3);


	}

}
