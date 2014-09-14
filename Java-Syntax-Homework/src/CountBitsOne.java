import java.util.Scanner;


public class CountBitsOne {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int n = Math.abs(userInput.nextInt());
		
		String nBin = String.format("%16s", Integer.toBinaryString(n)).replace(" ", "0");
		int counter = 0;
		
		for (int i = 0; i < nBin.length(); i ++){
			
			char temp = nBin.charAt(i);
			if (temp == '1'){
				counter ++;
			}
		}//end of for
		System.out.println(nBin);
		System.out.println(counter);
	}//end of main
}//end of class
