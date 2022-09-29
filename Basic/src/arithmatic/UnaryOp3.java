package arithmatic;

public class UnaryOp3 {
	public static void main(String[] args) {
		int a = -1, b;
		b = a++ + ++a + ++a + a;
	
		System.out.println("a: "+a);// 
		System.out.println("b: "+b);//
		System.out.println("**********************");
		a = 7;
 		b = a-- + --a + --a + a;// 7 + 5 +4 +4
	                            // 6 + 5  4  4
		System.out.println("a: "+a);//
		System.out.println("b: "+b);// 

		a = -21;
		b = --a + --a + --a + a + ++a + a++;//-22 -22 -22 -22 -21 -20
		
		System.out.println(a);// 
		System.out.println(b);// 

		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		
		System.out.println(a);//
		System.out.println(b);//
	}
}

