import java.util.Scanner;

public class _01_SymmetricNumbersRange {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int start = userInput.nextInt();
		int end = userInput.nextInt();

		for (int i = start; i <= end; i++) {

			String reverseNum = new StringBuilder(Integer.toString(i)).reverse().toString();

			if (reverseNum.equals(Integer.toString(i))) {
				System.out.print(i + " ");
			}
		}// end of for
	}// end of main
}// end of class
