import java.util.Scanner;


public class CountBitPairs {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		 
         int n = userInput.nextInt();
         int counter = 0;
         int prevBit = -1;
         
         /*String nBin = Integer.toBinaryString(n);
         for (int i = 0; i < nBin.length() - 1; i ++){
        	if (nBin.charAt(i) == nBin.charAt(i + 1)) {
        		counter ++;
        	}
         }*/

         while (n != 0){
 
        	 if ((n & 1) == prevBit){
        		 counter ++;
        	 }
        	prevBit = n & 1;
        	n >>= 1;        	
         }//end of while
         
     	System.out.println(counter);

	}//end of main

}//end of class
