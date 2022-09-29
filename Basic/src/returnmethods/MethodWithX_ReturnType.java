package returnmethods;

public class MethodWithX_ReturnType {


	public static void main(String[] args) {
		System.out.println("Programs Starts");
		getROI();//you will be able to execute method body but you won't get its return value to print or use
		System.out.println("*******************getROI with value in console********************************");
	}	
	/**
	 * simple interest: roi = (p*r*t)/100;
	 * @param args
	 */
	static double getROI() {
		int p=55000, t=2;
		float r=5.5f;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	
	
	}
