package thiskeywords;

class Student1 {
	//Global Var
	int rollno;	
	float fee;
	
	Student1(int rollno, float fee) {
	//  Global Var = Local Var;
		this.rollno = rollno;	  
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " "+ fee);
	}
}

class ThisKeyword11 {
	public static void main(String args[]) {
		Student1 s1 = new Student1(111, 5000f);
		Student1 s2 = new Student1(112, 6000f);
		s1.display();//111 5000.0
		s2.display();//112 6000.0
	}
}