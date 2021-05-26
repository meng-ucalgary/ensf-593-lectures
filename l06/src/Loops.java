
public class Loops {
	
	//TODO add a constant class variable LOSSRATE for losingGrass()
	public static final double LOSSRATE = 0.02;
	
	/**
	 * 
	 * Using gradient descent to approximate square root
	 * 
	 * @param start initial guess
	 * @param lr gradient descent learning rate, e.g. 0.1
	 * @param steps number of gradient descent steps
	 * @param square the number to estimate the square root from
	 * @return estimate of the square-root of square
	 */
	public static double gradientDescentSqrt(double start, 
										double lr, 
										int steps,
										double square) {
		
		double x = start;
		
		//TODO implement gradient descent
		//TODO repeat steps times
		for(int i=0; i<steps; i++) {
			//TODO x_{i+1} = x_i - lr * (x^2 - square)
			x = x - lr * (Math.pow(x, 2) - square);
		}
		
		
		return x;
	}
	
	/**
	 * Self-study exercise 6.9 p. 262:
	 * 
	 * Start with any positive integer, N. 
	 * If N is even, divide it by 2. 
	 * If N is odd, subtract 1 and then divide it by 2. 
	 * This will generate a sequence that is guaranteed to terminate at 0. 
	 * For example, if N is initially 15, 
	 * then you get the sequence: 15, 7, 3, 1, 0. 
	 * 
	 * @param N starting value
	 */
	public static void sequence(int N) {
		//TODO implement according to specification using a while loop. 
		//TODO method should print the entire sequence
		
//		System.out.println(N);
		while(N != 0) {
			System.out.println(N);
			if(N%2 == 0) {//N is even
				N = N/2;
			}else {
				N = (N-1)/2;
			}
//			System.out.println(N);
			
		}
		System.out.println(N);
		
		
	}
	
	/**
	 * Loosing grass on p.263
	 * 
	 * Starting at 100%, grass is lost at a rate LOSSRATE per day.
	 * How many weeks until only perCentGrass is left?
	 * 
	 * Uses LOSSRATE class variable (constant)
	 * 
	 * @param perCentGrass to stop loss calculation
	 * @return number of weeks until perCentGrass is left.
	 */
	public static int losingGrass(double perCentGrass) {
		double amtGrass = 100.0; // Initialize amount grass 
		int nDays = 0; // Initialize day counter 
		do{ // Repeat
			amtGrass -= amtGrass * LOSSRATE; // Update amount
			++nDays ;
			System.out.println(""+nDays+": "+amtGrass);
		} while ( amtGrass > perCentGrass);
		return nDays / 7;
		} // losingGrass ()

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(gradientDescentSqrt(1.0, 0.1, 10, 2.0));
		
//		sequence(15);
		
		System.out.println(losingGrass(50.0));;

	}

}
