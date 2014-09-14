import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);

		int num = userInput.nextInt();
		System.out.println(Integer.toHexString(num).toUpperCase());
	}// end of main
}// end of class
