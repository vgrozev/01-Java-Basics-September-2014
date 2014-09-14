import java.util.Arrays;
import java.util.Scanner;

public class SortArrayofStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the size of the array: ");
		int size = sc.nextInt();
		String[] strToSort = new String[size];

		System.out.println("Please enter " + size + " strings to sort: ");		
		for (int i = 0; i < size; i++) {
			
			strToSort[i] = sc.next();
		}

		Arrays.sort(strToSort);
		
		System.out.println("");
		System.out.println("The sorted array is: \n");
		for (int i = 0; i < strToSort.length; i++) {
			System.out.println(strToSort[i]);		
		}
		
		sc.close();
	}
}
