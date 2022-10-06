package linked_Queue;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
public class Practice {

	public static void main(String[] args) {
		Queue<Integer> cp = new PriorityQueue<Integer>(); 
		cp.add(123);
		cp.add(04);
		cp.add(10);
		cp.add(100);
		
		System.out.println("the size of the list is : " + cp.size());
		System.out.println("the elements are : " +cp);
		for (int cs:cp) {
			System.out.println(cs);
		}
		
		System.out.println("the head elements : " +cp.element());
		
		System.out.println(" the peek method : " +cp.peek());
		
		
		for (Object obj : cp) {
			System.out.println(obj);
		}
		
		System.out.println(" by using the itertor");
		Iterator csp = cp.iterator();
		while(csp.hasNext()) {
			System.out.println(csp.next());
		}
		//System.out.println(" remove method : " +cp.poll());
		//System.out.println(" the elements are : " +cp);
		//System.out.println("poll method : " +cp.remove());
		//System.out.println(" the elemets are : " +cp);
		System.out.println(" using lamda expression");
		
		cp.forEach(obj-> {
			System.out.println(obj);
		});
		
		
		
		
		
		
		
	}
	

}
