package collection;
import java.util.ArrayList;
public class Practice2 {

	public static void main(String[] args) {
		ArrayList c1 = new ArrayList();
        System.out.println("is there any element is present : " +c1.isEmpty());
		c1.add("chetan");
		c1.add("patil");
		c1.add("cspatil");
		System.out.println("printing the array : " +c1);
		
		c1.add(2, "engineer");		
		System.out.println("after : " +c1);		
				
				
		ArrayList c2 = new ArrayList();
		c2.add("jalgaon");
		c2.add("pune");
		System.out.println(" size of the array : " +c2.size());
		System.out.println("printing the element : " +c2);
		
		c1.addAll(c2);
		System.out.println(" printing the array after addAll : " +c1);
	}
}
