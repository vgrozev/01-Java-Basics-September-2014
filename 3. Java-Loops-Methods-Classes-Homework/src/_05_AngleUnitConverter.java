
import java.util.Scanner;


public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int numInput = userInput.nextInt();
		
		for (int i = 0; i < numInput; i ++){
			double number = userInput.nextDouble();
			String measure = userInput.next();
			if (measure.equals("deg")){
				System.out.printf("%.6f rad\r\n", toRadins(number));
			}
			else{
				System.out.printf("%.6f deg\r\n", toDegrees(number));
			}
		}
	}//end of main
	
	private static double toRadins(double degrees){
		double radians = (degrees/180)*Math.PI;
		return radians;
	}
	
	private static double toDegrees(double radians){
		double degrees = (radians*180)/Math.PI;
		return degrees;
	}
}//end of class
