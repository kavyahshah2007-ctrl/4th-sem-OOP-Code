class Bank{
	String Bankname;
	String area;
	Bank(String Bankname,String area){
		this.Bankname=Bankname;
		this.area=area;	
	}
	
	void show() {
		System.out.print("\n BANKNAME ="+Bankname);
		System.out.print("\n AREA="+area);
		
	}
}

interface Atm{
	int maxwid=2000;
	void disp();
}
interface Loan{
	int amount=1000000;
	void am();
	
}
class Customer6 extends Bank implements Atm,Loan{
	int cid;
	String cna;
	double bal;
	Customer6(String Bankname,String area,int cid,String cna,double bal)
	{
		super(Bankname,area);
         this.cid=cid;
         this.cna=cna;
         this.bal=bal;
	
	}
	
	public void disp() {
		System.out.print("\n MAXIMUM WIDTHDRAWAL="+maxwid);
	}
	
	public void am() {
		System.out.print("\n AMOUNT "+amount);
			
	}
	 void display() {
		disp();
		am();
		show();
	}
}
public class MyBank1 {

	public static void main(String[] args) {
		Customer6 c1=new Customer6("HDFC","KARELIBAUG",12,"KAVYA",200000);
		c1.display();

	}

}
