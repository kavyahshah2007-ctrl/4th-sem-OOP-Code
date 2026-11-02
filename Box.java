
class MyBox
{
	int len,wid;

	MyBox(int l,int w)
	{
		
		len=l;
		wid=w;
	}
	
   MyBox(int l)
   {
	len=l;
	wid=l;
   }
  
    MyBox()
    {
    	 len=0;
     wid=0;
    }
   MyBox(char x)
   {
	  
   }

   
   void show()
   {
	   System.out.print("\n \n LENGTH"+len);
	   System.out.print("\n \n WIDTH "+wid);
   }
   
   void show(int a)
   { }
   void show(int a,int b)
   { }
   void show(char c)
   {}
}
  public class Box {

	public static void main(String[] args) {
		MyBox b1=new MyBox(10,20);
		MyBox b2=new MyBox(5,6);
		MyBox b3=new MyBox(100);
		MyBox b4=new MyBox();
		
		
		b1.show();
		b2.show();
		b3.show();
		b4.show();
		
		

	}

}
