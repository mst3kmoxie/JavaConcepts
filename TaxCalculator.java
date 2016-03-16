import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {

		int status;
		DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00");

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your income: ");
		double income = input.nextDouble();

		System.out.println("Are you married? (Y/N)");
		String reply = input.next();

		if (!reply.equalsIgnoreCase("Y") && !reply.equalsIgnoreCase("N"))
			System.out.println("You have given an invalid reply.");

		else {
			
			if (reply.equalsIgnoreCase("Y"))
				status = TaxReturn.MARRIED;
			else
				status = TaxReturn.SINGLE;

			TaxReturn taxReturn = new TaxReturn(income, status);

			System.out.println("Tax: " + moneyFormat.format(taxReturn.getTax()));
		}

	}
}
