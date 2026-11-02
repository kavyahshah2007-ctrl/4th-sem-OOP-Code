class Student2{
	int id;
	String name;
	int age;
	
	Student2(int a,String b,int c){
		id=a;
		name=b;
		age=c;
	}
	
	void show() {
		System.out.print("\n ID="+id);
		System.out.print("\n NAME= "+name);
	    System.out.print("\n AGE"+age);
	}
}

class Computer extends Student2{
	int c_lang,cpp,java,total,percentage;
	Computer(int a,String b,int c,int d,int e,int f){
		super(a,b,c);
		c_lang=d;
		cpp=e;
		java=f;
		total=c_lang+cpp+java;
		percentage=total/3;
	}
	
	void display() {
		System.out.print("\n \n Computer Student:- \n ");
	     show();
		System.out.print("\n C_LANGUAGE MARKS="+c_lang);
		System.out.print("\n C++ MARKS="+cpp);
		System.out.print("\n JAVA MARKS="+java);
		System.out.print("\n TOATAL MARKS="+total);
		System.out.print("\n PERCENTAGE ="+percentage);
	}
}

class It extends Student2{
	int phyton,net,dsa,total,percentage;
	
	It(int a,String b,int c,int g,int h,int i){
		super(a,b,c);
		phyton=g;
		net=h;
		dsa=i;
		total=phyton+net+dsa;
		percentage=total/3;
		
	}
	
	void output() {
		System.out.print("\n \n IT Student:- \n");
		  
		show();
		System.out.print("\n PHYTON MARKS="+phyton);
		System.out.print("\n NET MARKS="+net);
		System.out.print("\n DSA MARKS="+dsa);
		System.out.print("\n TOATAL MARKS="+total);
		
		System.out.print("\n PERCENTAGE ="+percentage);
	}
	
}

class Mechanical extends Student2{
	int mos,eg,pee,total,percentage;
  
	Mechanical(int a,String b,int c,int j,int k, int l){
		super(a,b,c);
		mos=j;
		eg=k;
		pee=l;
		total=mos+eg+pee;
		percentage=total/3;
	}
    void print() {
    	    System.out.print("\n \n Mechanical Student :-\n ");
  	  
    	     show();
        System.out.print("\n MOS MARKS="+mos);
		System.out.print("\n EG MARKS="+eg);
		System.out.print("\n PEE MARKS="+pee);
		System.out.print("\n TOATAL MARKS="+total);
		System.out.print("\n PERCENTAGE ="+percentage);
    }
}

public class MyCollege {

	public static void main(String[] args) {
		Computer c1=new Computer(101,"KAVYA",19,90,97,96);
		c1.display();
		
		It i1=new It(102,"MANAV",19,96,95,94);
		i1.output();
		
		Mechanical m1=new Mechanical(103,"RAJESH",19,87,76,89);
		m1.print();

	}

}
