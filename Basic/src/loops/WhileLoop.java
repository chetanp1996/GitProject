package loops;

public class WhileLoop {
	public static void main(String args[]) {
		int i = 0;
		System.out.println("Printing numbers from 1 to 5");
		/*
		 * while (Boolean Condition) 
		 * { 
		 * 		//
		 * }
		 */

		while (i < 5) {
			System.out.println("Hello " + i);
			i++;
		}
		
		int a=5;
		while(a>0) {
			System.out.println("bye " + a);
			a--;
		}
	}
}