import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int x = 0;
		int y = 1;
		
		int[] a = new int[2];
		a[0] = userInput.nextInt();
		a[1] = userInput.nextInt();
		
		int[] b = new int[2];
		b[0] = userInput.nextInt();
		b[1] = userInput.nextInt();
		
		int[] c = new int[2];
		c[0] = userInput.nextInt();
		c[1] = userInput.nextInt();

		int triangleArea = (a[x]*(b[y] - c[y]) + b[x]*(c[y] - a[y]) + c[x]*(a[y] - b[y]))/2;
		
		System.out.println(Math.abs(triangleArea));
		
	} // end of main
} // end of class
