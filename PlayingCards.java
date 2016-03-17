public class PlayingCards {

	private String suitId;
	private String suitName;
	private String cardNum;
	private String number;
	private String card;

	public PlayingCards(String chosenCard) {
		card = chosenCard.toUpperCase();
	}

	public String getDescription() {
		suitId = card.substring(card.length() - 1);
		cardNum = card.substring(0, card.length() - 1);
		String description;

		if (suitId.equals("D") || suitId.equals("H") || suitId.equals("S")
				|| suitId.equals("C")) {

			switch (suitId) {
			case "D":
				suitName = "Diamonds";
				break;
			case "H":
				suitName = "Hearts";
				break;
			case "S":
				suitName = "Spades";
				break;
			default:
				suitName = "Clubs";
			}

			switch (cardNum) {
			case "A":
				number = "Ace";
				break;
			case "J":
				number = "Jack";
				break;
			case "Q":
				number = "Queen";
				break;
			case "K":
				number = "King";
				break;
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
				number = cardNum;
				break;
			default:
				number = "**invalid input**";
			}
			
			description = "You have the " + number + " of " + suitName + ".";

		} else {
			
			description = "You have entered an invalid suit notation.";

		}

		//String description = "You have the " + number + " of " + suitName + ".";
		
		return description;
	}
}
