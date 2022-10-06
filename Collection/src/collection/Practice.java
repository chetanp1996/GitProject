package collection;
import java.util.Vector;
public class Practice {

	public static void main(String[] args) {
		Vector<String> vtr= new Vector<String>();
		System.out.println("default capacity of the vector is : " +vtr.capacity());
		System.out.println(" the size of the vector is : " +vtr.size());
		System.out.println("the elements of the vector : " +vtr);
		
		vtr.addElement("engineer");
		vtr.addElement("cspatil");
		System.out.println("the size of the element : " +vtr.size());
		System.out.println("the elements are : " +vtr);
		vtr.add("chetan");
		vtr.add("patil");
	
		System.out.println(" " +vtr);
		System.out.println(" after adding size : " +vtr.size());
		System.out.println(" the capacity : " +vtr.capacity());
		
	}

}
