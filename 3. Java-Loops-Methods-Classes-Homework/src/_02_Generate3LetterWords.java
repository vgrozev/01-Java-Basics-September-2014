import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		String chars = userInput.nextLine();

		for (int first = 0; first < chars.length(); first++) {
			for (int mid = 0; mid < chars.length(); mid++) {
				for (int last = 0; last < chars.length(); last++) {
					System.out.printf("%c%c%c ", chars.charAt(first),chars.charAt(mid), chars.charAt(last));
				}// end of inner for
			}// end of second for
		}// end of first for
	}// end of main
}// end of class
