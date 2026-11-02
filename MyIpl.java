class Cricket{
	String PlayerName;
	String CountryName;
	
	Cricket(String a,String b){
		PlayerName=a;
		CountryName=b;
	}

     void display () {
    	 System.out.print("\n PLAYERNAME="+PlayerName);
     System.out.print("\n COUNTRYNAME="+CountryName);
     }
     
}

class Batsman extends Cricket{
        int Matches;
        int Runs;
        
        Batsman (String a,String b,int c,int d){
        	super(a,b);
        	Matches=c;
        	Runs=d;
        }
        
       void show() {
    	   display();
    	   System.out.print("\n MATCHES="+Matches);
    	   System.out.print("\n RUNS="+Runs);
       }
        
}
class Bowler extends Batsman{
	int overs;
	int Wickets;
	
	Bowler (String a,String b,int c,int d,int e,int f){
		super(a,b,c,d);
		overs=e;
		Wickets=f;
	}
    void output() {
    	show();
    	System.out.print("\n overs="+overs);
    	System.out.print("\n WICKETS="+Wickets);
    }
}
public class MyIpl {

	public static void main(String[] args) {
		Bowler b1 =new Bowler("KAVYA","INDIA",102,5000,90,200);
		b1.output();

	}

}
