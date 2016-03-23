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
			System.out.println("There is at least one real solution given your input.");
			
			double solution1 = test.getSolution1();
			double solution2 = test.getSolution2();
			
			System.out.println("The solutions are " + solution1 + " and " + solution2 + ".");
		
		
		
		} else if(!test.hasSolution())
			System.out.println("There are no real solutions given your input.");
	}
}
