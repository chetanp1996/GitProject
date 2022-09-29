package returnmethods;

public class MethodWithX_ReturnType2_Calling {

	/** simple interest: roi = (p*r*t)/100;*/
	static double getROI() {
		int p=55000, t=2;
		float r=5.5f;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
		//System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	static double getROI(int p,int t,float r) {
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	public static void main(String[] args) {
		System.out.println("Programs Starts");
		getROI();//you will be able to execute method body but you won't get its return value to print or use
		System.out.println("*******************getROI with value in console********************************");
		//you will be able to execute method body as well as you also get return value in the console
		System.out.println("Interest to be paid is: "+getROI());
		System.out.println("*******************getROI, return value store in variable********************************");
		//you will be able to execute method body and its return value will be store in the variable for future use
		double x=getROI();
		double finalAmoutToBePaid=55000+x;
		System.out.println("Total Amount to be paid incluiding interest : "+finalAmoutToBePaid);

		System.out.println("************Using parameter*******************");		
		int amount=95000;
		double interest=getROI(amount, 2, 4.5f);
		double finalAmout=amount+interest;
		System.out.println("Total amount paid by you: "+finalAmout);
		System.out.println("************Using parameter2*******************");		
		interest=MethodWithX_ReturnType2_Calling.getROI(85000, 2, 4.5f);
		finalAmout=85000+interest;
		System.out.println("Total amount paid by you: "+finalAmout);
		System.out.println("Programs Ends");
	}
}

