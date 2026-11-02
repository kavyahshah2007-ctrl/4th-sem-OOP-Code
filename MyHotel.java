class Hotel{
	String hna;
	String special;
	
	Hotel(String hna,String special){
		this.hna=hna;
		this.special=special;
	}
	
	void show() {
		System.out.print("\n HOTELNAME="+hna);
		System.out.print("\n Special="+special);
	}
}
 interface complimentary {
	 int bottels=5;
	 int napkin=10;
	 void disp();
	 
 }
 class Customer extends Hotel implements complimentary{
	 int person;
	 int fill;
    
	 Customer(String hna,String special,int person,int fill){
		 super(hna,special);
		 this.person=person;
		 this.fill=fill;
	 }
	 void output() {
		 System.out.print("\n PERSON="+person);
	     System.out.print("\n FILLS="+fill);
	 }
	 
	 
	 public void disp() {
	 System.out.print("\n No. of bottels="+bottels);
	 System.out.print("\n No. of napkin="+napkin);
	 		
 }
   void display() {
	   
	   show();
	   disp();
	   output();
		
   }
 
 
 }
 
 
public class MyHotel {

	public static void main(String[] args) {
		Customer c1=new Customer("TAJ_HOTEL","KAVYA",5,8);
		c1.display();

	}

}
