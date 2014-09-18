
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		String d1 = userInput.nextLine();
		String d2 = userInput.nextLine();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        
        double diffOfDays = formatter.parse(d2).getTime() - formatter.parse(d1).getTime();
        diffOfDays = diffOfDays/(1000*24*60*60);
		
		System.out.println(Math.round(diffOfDays));
	}// end of main
}// end of class
