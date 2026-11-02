import java.util.Stack;
class Employe{
	int id;
	String name;
	long sal;
	
	
	Employe (int id,String name,long sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString(){
		return ""+id+","+name+","+sal;
	}
}
public class MyStack {

	public static void main(String[] args) {
		Stack st=new Stack();
		
		System.out.print("\n \n CAPACITY"+st.capacity());
        System.out.print("\n \n SIZE"+st.size());
         
        st.push(new String ("SVIT"));
        st.push(new String ("JAVA"));
        st.push(Integer.valueOf (10));
        st.push(Integer.valueOf (20));
        st.push(Float.valueOf (1.3f));
        st.push(Double.valueOf (10.34));
        st.push(new Employe (101,"MANAV",50000));
        st.push(new Employe(101,"KAVYA",100000));
        st.push(new Employe (101,"PREET",5000));
        st.push(new String("MY NAME IS KAVYA"));
        st.push(new String ("Batch"));
        
        System.out.print("\n \n CAPACITY"+st.capacity());
        System.out.print("\n \n SIZE"+st.size());
         
        while(!st.empty())
        {
        	System.out.print("\n \n "+st.pop());
        }
	}

}
