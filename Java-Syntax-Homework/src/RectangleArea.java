import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt();
		int b = userInput.nextInt();
		
		int area = a*b;
		System.out.println(area);
	}

}
