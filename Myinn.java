class Person{
	String name;
	int age;
	Person(int a,String b){
		age=a;
		name=b;
	}

void show() {
	System.out.print("\n NAME="+name);

	System.out.print("\n Age="+age);

 }
}
class Student1 extends Person
{
	int m1,m2,m3,total,per;
   Student1(int m1,int m2,int m3, String b,int a)
   {
	   super(a,b);
	   this.m1=m1;
	   this.m2=m2;
	   this.m3=m3;
	   total=m1+m2+m3;
	   per=total/3;
	   
   }
   void display() {
	   show();
	   System.out.print("\n Total marks="+total);
	   System.out.print("\n percentage="+per);
	   
   }
   
   
   
   
   
}



public class Myinn {

	public static void main(String[] args) {
		
    Student1 s1=new Student1(10,20,30,"KAVYA",19);
    s1.display();
	}

}
