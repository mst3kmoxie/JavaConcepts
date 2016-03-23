
public class QuadraticEquation {

	private double solution1;
	private double solution2;
	private double testA;
	private double testB;
	private double testC;

	public QuadraticEquation(double a, double b, double c) {
		testA = a;
		testB = b;
		testC = c;
	}
	
	public double getSolution1() {
		
		solution1 = ((-1 * testB) + (Math.sqrt((testB * testB) - (4* testA * testC)))) / (2 * testA);
		return solution1;
		
	}
	
	public double getSolution2() {
		
		solution2 = ((-1 * testB) - (Math.sqrt((testB * testB)- (4* testA * testC)))) / (2 * testA);
		return solution2;
		
	}
	
	public boolean hasSolution() {
		
		if(Math.sqrt((testB * testB) - (4 * testA * testC)) < 0 ) {
			return false;
		}
		else
			return true;
	}
	
}


