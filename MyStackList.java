import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

class Employe6


{
	int id;
	String name;
	long sal;
	
	
	Employe6 (int id,String name,long sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString(){
		return ""+id+","+name+","+sal;
	}
}
public class MyStackList {

	public static void main(String[] args) {
          ArrayList st=new ArrayList();
          
        
		
		
         
        st.add(new String ("SVIT"));
        st.add(new String ("JAVA"));
        st.add(Integer.valueOf (10));
        st.add(Integer.valueOf (20));
        st.add(Float.valueOf (1.3f));
        st.add(Double.valueOf (10.34));
        st.add(new Employe6 (101,"MANAV",50000));
        st.add(new Employe6(101,"KAVYA",100000));
        st.add(new Employe6 (101,"PREET",5000));
        st.add(new String("MY NAME IS KAVYA"));
        st.add(new String ("Batch"));
        
        for(int i=0;i<st.size();i++) 
        {
        	System.out.print("\n "+st.get(i));
        }
        
        for(int i=st.size()-1;i>=0;i--)
        {
        	System.out.print("\n "+st.get(i));
        }
        
                 
	}

}






