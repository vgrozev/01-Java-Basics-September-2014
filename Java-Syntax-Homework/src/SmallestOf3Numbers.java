import java.text.DecimalFormat;
import java.util.Scanner;


public class SmallestOf3Numbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		double num = Double.MAX_VALUE;
		DecimalFormat formater = new DecimalFormat();
		
		for (int i = 0; i < 3; i++) {
			double temp = userInput.nextDouble();
			if (temp < num){
				num = temp;
			}
		}//end of for
		
		System.out.println(formater.format(num));
	}// end of main
}// end of class
