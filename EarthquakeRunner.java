import java.util.Scanner;


public class EarthquakeRunner {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a magnitude on the Richter Scale: ");
		double magnitude = input.nextDouble();
		Earthquake quake = new Earthquake(magnitude);
		System.out.println(quake.getDescription());
		
	input.close();
	}
}
