import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _06_Random5Cards {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int n = userInput.nextInt();
		String[] cards = buildDeck();
			
		for (int i = 0; i < n; i ++){
			Collections.shuffle(Arrays.asList(cards));
			for(int j = 0; j < 5; j ++){
				System.out.print(cards[j] + " ");
			}
			System.out.println();
		}//end of for		
	}//end of main
	
	private static String[] buildDeck() {
		int counter = 0;
		String[] cardsValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] deck = new String[52];
		
		for (int i = 0; i < cardsValue.length; i++) {
			int suits = 9830; //unicode table		
			for (int k = 0; k < 4; k++){	
				suits -= k;
				deck[counter] = cardsValue[i] + (char)suits;
				counter ++;
			}
		}//end of for
		//for (int j = 0; j < deck.length; j++) {System.out.print(deck[j] + " ");}	
		return deck;
		
	}// end of buildDeck()
}//end of class
