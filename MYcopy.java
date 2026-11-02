class Employee{
	int id;
	String name;
	int age;
	
	Employee(int a,String b,int c){
		id=a;
		name=b;
		age=c;
	}
	void display() {
		System.out.print("\n ID="+id);
		System.out.print("\n NAME="+name);
		System.out.print("\n AGE="+age);
	}
}

class Commission extends Employee{
	double sales;
	double com;
	
	Commission(int a,String b,int c,double d){
		super(a,b,c);
		sales=d;
		com=sales*0.1;
	}
	void display() {
		super.display();
		System.out.print("\n SALES="+sales);
		System.out.print("\n COMMISSION="+com);
	
	}
}
class Permanant extends Employee{
	double salary;
	
	Permanant(int a,String b,int c,double e){
		super(a,b,c);
		salary=e;
	}
	void display() {
		super.display();
		System.out.print("\n SALARY="+salary);
	}
}

class Monthly extends Permanant{
	double hra,da,total;
	
	Monthly(int a,String b,int c,double e){
		super(a,b,c,e);
		hra=salary*0.1;
		da=salary*0.01;
		total=hra+da;
	}
	void display() {
		super.display();
		System.out.print("\n DRA="+hra);
		System.out.print("\n DA="+da);
		System.out.print("\n TOTAL="+total);	
	}
}
class Daily extends Permanant{
	double hrs,pay;

	Daily(int a,String b,int c,double f,double g){
		super(a,b,c,f*g);
		salary=hrs*pay;
	}
	void display() {
		super.display();
	
		
		
		System.out.print("\n PAYS="+pay);
		System.out.print("\n HRS="+hrs);
		System.out.print("\n SALARY="+salary);
	}
}
public class MyBank {

	public static void main(String[] args) {
		Commission c1=new Commission(101,"KAVYA",19,50);
		c1.display();
		
       
		Daily d1= new Daily(101,"KAVYA",19,5,9000);
		d1.display();
		
		Monthly m1=new Monthly(101,"KAVYA",19,50000);
		m1.display();
	}

}
