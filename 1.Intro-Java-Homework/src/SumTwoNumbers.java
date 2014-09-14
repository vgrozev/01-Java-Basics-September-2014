import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Please enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("The sum is: " + (num1 + num2));
		sc.close();
	}

}
