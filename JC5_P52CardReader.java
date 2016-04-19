import java.util.Scanner;


public class JC5_P52CardReader {
	public static void main(String[] args) {
		
		Scanner output = new Scanner(System.in);
		
		System.out.println("Please enter the card notation:");
		String note = output.nextLine();
		
		JC5_P52Card card = new JC5_P52Card(note);
		
		System.out.println("The card you selected is:  " + card.getDescription());
		
	output.close();	
	}
}
