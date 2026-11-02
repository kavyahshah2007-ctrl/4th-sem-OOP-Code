class Box1{
	int len,wid;
	Box1(int l,int w){
		len=l;
		wid=w;	
	}

   void show() {
	   System.out.print("\n len="+len);
	   System.out.print("\n wid="+wid);
   }
   int area() {
	   return len*wid;
   }
}
// class child extends parent
class Box3d extends Box1
{
     int vol,height;
     Box3d(int l,int w,int h){
    	    //super se uper kuch nahi.
    	     super(l,w);
    	     height=h;
    	     
     }
     
     void display() {
    	 show();
    	 vol=height*area();
    	 System.out.print("\n volume="+vol);
     }
     
}



public class Myinhheritance {

	
	public static void main(String[] args) {
		Box3d b1=new Box3d(10,20,30);
		b1.display();
     
	}

}
