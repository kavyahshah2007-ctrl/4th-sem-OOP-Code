class College{
	String cna;
	String city;
	
	College(String cna,String city){
		this.cna=cna;
		this.city=city;
	}
	
	void show() {
		System.out.print("\n COLLEGE_NAME="+cna);
        System.out.print("\n CITY="+city);	
	}
}

interface Crusine{
	String dish="VadaPav";
	void disp();
}

interface Canteen extends Crusine{
	int price =50;
	void output();
}
interface Sports{
	String sp="Cricket";
	void spe();
}

class Student7 extends College implements Canteen,Sports{
	int sid;
	String sna;
	int age;
	
	Student7(String cna,String city,int sid,String sna,int age){
		super(cna,city);
		this.sid=sid;
		this.sna=sna;
		this.age=age;
	}
	void stu() {
		System.out.print("\n STUDENT_ID="+sid);
		System.out.print("\n STUDENT_NAME="+sna);
		System.out.print("\n STUDENT_AGE="+age);
	}
	
	public void disp() {
		System.out.print("\n Dish="+dish);
	}
	
	public void output() {
		System.out.print("\n Price="+price);
	}
	
	public void spe() {
		System.out.print("\n Sports="+sp);
	}
	
	void display() {
		show();
		disp();
		output();
		spe();
		stu();
	}
}
public class MyInterface2 {

	public static void main(String[] args) {
		Student7 s1=new Student7("SVIT","VASAD",163,"KAVYA",19);
		s1.display();

	}

}
