class Date
{
	int dd,mm,yy;
	
//	Date(int d,int m,int y)
//	{
//		dd=d;  mm=m; yy=y;
//	}
	Date()
	{}

	class Time
	{
		int hr,mm,sc;
		Time(int a,int b,int c,int h,int m,int s)
		{
			dd=a;  Date.this.mm=b;  yy=c;
			
			hr=h;  this.mm=m;  sc=s;
		}
		void display()
		{
			show();
			System.out.print("\n TIME = "+hr+":"+mm+":"+sc);
		}
	}
	
	void show()
	{
		System.out.print("\n DATE = "+dd+"/"+mm+"/"+yy);
	}
	
	
}


public class MyInner {

	
	public static void main(String[] args) {
	
//		Date d =  new Date(18,3,2026);
//		Date.Time d
		//t = d.new Time(7,45,25);
		
//		Date.Time dt = new Date(18,3,2026).new Time(7,50,12);
		
		Date.Time dt = new Date().new Time(18,3,2026,7,55,35);
		
		dt.display();
	}
}

