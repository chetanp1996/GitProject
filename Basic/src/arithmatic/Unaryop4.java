package arithmatic;

public class Unaryop4 {

	public static void main(String[] args) {
		
		int a = 0,b;
		b= a++ + ++a + ++a +a;//0+ 2 3 3
		System.out.println(a);//1  2 3
		System.out.println(b);
		
		a=0;
		b= a-- + --a + --a + a;
		System.out.println(a);
		System.out.println(b);
		
		a=0;
		b= --a + --a + --a + a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		
		a=0;
		b= a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);
		System.out.println(b);
		
		
	}
}