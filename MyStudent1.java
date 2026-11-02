

class Student{
	int id;
	String name;
	int age;
	

	Student()
	{}
	
	
	class Result{
	  int m1, m2, m3;
	  int total,per;
	  Result(int a,String b,int c,int d,int e,int f){
		  id=a; name=b; age=c;
		  m1=d; m2=e; m3=f;
		  total=m1+m2+m3;
		  per=total/3;
		  
	  }
	  void display() {
		  
	  
		  show();
		  System.out.print("\n Result="+m1+":"+m2+":"+m3+":"+total+":"+per);
	  }
	}
	  void show()
		{
			System.out.print("\n Student = "+id+"/"+name+"/"+age);
		}
		
}		
											
		
	
public class MyStudent1 {

	public static void main(String[] args) {
		
		Student.Result sr = new Student().new Result(6,"KAVYA",19,98,97,89);
		sr.display();
	}

}