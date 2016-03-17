import java.util.Scanner;


public class PlayingCardReader {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the card notation: ");
		String cardNote = input.next();
		
		PlayingCards card = new PlayingCards(cardNote);
		
		System.out.println(card.getDescription());
		
	input.close();
	}
}
