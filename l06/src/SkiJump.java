public class SkiJump {

	/**
	 * Solve Exercise 6.9 p. 292 using:
	 * 
	 * - nested for loops
	 * - nested while loops
	 * - nested do-while loops
	 * 
	 * Should print the following pattern:
	 * # 
	 * # # 
	 * # # # 
	 * # # # # 
	 * # # # # # 
	 * # # # # # # 
	 * # # # # # # #
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n--- for --------------------------------\n");
		// for loop
		skiJumpFor();
		
		System.out.println("\n--- while ------------------------------\n");
		
		// while loop
		skiJumpWhile();
		
		System.out.println("\n--- do-while ----------------------------\n");
		
		// do-while loop
		skiJumpDoWhile();

	}

	/**
	 * Using do-while to solve Exercise 6.9 p. 292
	 */
	private static void skiJumpDoWhile() {
		
		//TODO implement loops
		int row = 0;
		do {
			
			int col=0;
			
			do {
				System.out.print("# ");
				col++;
			}while(col<=row);
			System.out.println("--> "+row);
			row++;
		}while(row<7);
		
	}

	/**
	 * Using while to solve Exercise 6.9 p. 292
	 */
	private static void skiJumpWhile() {
		
		//TODO implement loops
		
	}

	/**
	 * Using for to solve Exercise 6.9 p. 292
	 */
	private static void skiJumpFor() {
		
		//TODO implement loops
		for(int row=1; row <= 7;row++) {
			for(int col=0; col < row; col++) {
				System.out.print("# ");
			}
			System.out.println("--> "+row);
		}
		
	}

}
