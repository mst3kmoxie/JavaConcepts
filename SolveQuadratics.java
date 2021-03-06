import java.util.Scanner;


public class SolveQuadratics {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Quadratic Equation Solver.");
		System.out.println("Please enter value for a: ");
		double testA = input.nextDouble();
		
		System.out.println("Please enter value for b: ");
		double testB = input.nextDouble();
		
		System.out.println("Please enter value for c: ");
		double testC = input.nextDouble();
		
		QuadraticEquation test = new QuadraticEquation(testA, testB, testC);
		
		if (test.hasSolution()) {
			System.out.println("Given your input, there is at least one real solution.");
			
			double solution1 = test.getSolution1();
			double solution2 = test.getSolution2();
			
			System.out.println();
			System.out.println("The solutions are " + solution1 + " and " + solution2 + ".");
		
		
		
		} else
			System.out.println("Given your input, there are no real solutions.");
		
		
	input.close();	
	}
}
