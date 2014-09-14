import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt();
        double b = userInput.nextDouble();
        double c = userInput.nextDouble();
        
        String aHex = "";
        String aBin = "";
               
        if ((a >= 0) && (a <= 500)){
        	aHex = Integer.toHexString(a).toUpperCase();
        	aBin = String.format("%10s", Integer.toBinaryString(a)).replace(" ", "0");
        }
        else{
        	System.out.println("Not in range!");
        }
 
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", aHex, aBin, b, c);

	}//end of main

}//end of class
