import java.util.Arrays;
import java.util.Scanner;


public class FloatingNumberSorter {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number: ");
		float numberOne = input.nextFloat();
		
		System.out.println("Please enter your second number: ");
		float numberTwo = input.nextFloat();
		
		System.out.println("Please enter your third number: ");
		float numberThree = input.nextFloat();
		
		float[] numberList = {numberOne, numberTwo, numberThree};
		
		System.out.println("You entered " + numberOne + ", " + numberTwo + ", " + numberThree);
		
		Arrays.sort(numberList);
		
		 System.out.println("I have sorted them like this:");
		 
		 for(float number : numberList) {
			 System.out.println(number);
		 }
		
	
	input.close();
	}
}

