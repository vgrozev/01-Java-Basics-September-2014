
public class _04_FullHouseJokers {

	
	
	//*****************  in progress *************************
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cards = buildDeck();
		int count = 0;

		// jump to new value - every 4 cards
		for (int i = 0; i < cards.length; i += 4) {
			// for every new value, loop 4 combinations of 3 cards
			for (int j = 0; j < 4; j++) {
				// for every combination of 3 cards, loop again trough the dec every 4 cards
				for (int k = 0; k < cards.length; k += 4) {
					// if the additional cards are the same as the first 3 - skip
					if ((cards[k] == cards[i])) {continue;}
					// for every 3 cards selected loop trough all 2 instance combinations of the 4 suits.
					for (int m = 0; m < 3; m++) {
						for (int p = m + 1; p < 4; p++) {		
							//skip the first "..." while printing
							if (count != 0){System.out.print(" ... ");}
							System.out.printf("(%s %s %s %s %s)",
												cards[(j % 4) + i],
												cards[((j + 1) % 4) + i],
												cards[((j + 2) % 4) + i], 
												cards[m + k],
												cards[p + k]);
/*							//Check for jockers and insert them
							for (int n = 0; n < 5; n++) {
							int num = ((1 << n) & n) >> n;
							if (num == 1) {
							cards[n] = "*";
							}
							}
							for (String card : cards) {
							System.out.printf("(%s )", card);
							}
							System.out.println();*/
							
							count++;
						}//end of the most inner for
					}//end of the forth for
				}//end of the third for
			}//end of the second for
		} //end of the first for

		System.out.printf("\r\n %d full houses", count);
	}// end of main

	
	 //Method to build the Card Deck uncomment the line before the return
	 //statement, to see it printed
	 
	private static String[] buildDeck() {
		int counter = 0;
		String[] cardsValue = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A" };
		String[] cards = new String[52];

		for (int i = 0; i < cardsValue.length; i++) {
			int suits = 9830; // unicode table
			for (int k = 0; k < 4; k++) {
				suits -= k;
				cards[counter] = cardsValue[i] + (char) suits;
				counter++;
			}
		}

		// for (int j = 0; j < cards.length; j++) {System.out.print(cards[j] + " ");}

		return cards;

	}// end of buildDeck()
}// end of class _03_FullHouse
