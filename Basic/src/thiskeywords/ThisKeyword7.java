package thiskeywords;

public class ThisKeyword7 {
	int variable = 95;
	public static void main(String args[]) {
		ThisKeyword7 obj = new ThisKeyword7();
		obj.method(5);
		obj.method();
		System.out.println("value of instance variable :" + obj. variable);
	}
	void method(int variable) {
		System.out.println("value of local variable :" + variable);
		variable = 80;
		System.out.println("value of local variable :" + variable);
		System.out.println("Value of Instance variable :" + this.variable);//5
		this.variable=variable;
		System.out.println("value of local variable :" + variable);
		System.out.println("Value of Instance variable :" + this.variable);//5
		}
	void method() {
		int variable = 25;
		System.out.println("Value of Instance variable :" + this.variable);//5
		System.out.println("Value of Local variable :" + variable);//40
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//40
		System.out.println("Value of Instance variable :" + this.variable);//5
		
	}
}