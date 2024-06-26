
public class GradeAverage {
	
	private KeyboardReader reader = new KeyboardReader();
	
	private double promptAndRead() {
		
		reader.prompt("Enter a grade, or 9999 to quit: ");
		double grade = reader.getKeyboardDouble();
		return grade;
	}
	
	/**
	 * Use instead of promptAndRead()
	 * 
	 * Asks user to input with promptAndRead() 
	 * until valid input is received 
	 * 
	 * Uses isNotValid() method.
	 * 
	 * @return validated input.
	 */
	private double getAndValidate() {
		
		//TODO use do-while to promptAndRead()
		//     as long as input isNotValid()
		//     if isNotValid(), give the user a hint what to enter.
		double grade = 0.0;
		
		do {
			grade = promptAndRead();
			
			if(isNotValid(grade)) {
				System.out.println(""+grade+" is not a valid grade.");
				System.out.println("Enter 0<= grade <=100");
			}
			
		}while(isNotValid(grade));
		
		
		return grade;
		
	}
	
	/**
	 * Checks if input is valid
	 * 
	 * input is either 9999 (sentinel value)
	 * or 0<= input <= 100
	 * 
	 * IMPORTANT: If this test changes, hint to user in getAndValidate() 
	 *            needs to change accordingly
	 * 
	 * @param input to check
	 * @return true if input valid, false otherwise
	 */
	private boolean isNotValid(double input) {
		//TODO implement check
		return (input != 9999) && ((input < 0) || (input > 100));
	}

	/**
	 * Code from Figure 6.10 p. 269
	 * 
	 * TODO Can the loop be written differently? Maybe using break?
	 * 
	 * @return
	 */
	public double calculateAverage() {
		double runningTotal = 0;
		int count = 0;
		
		//TODO replace with getAndValidate()
		double grade = getAndValidate();//promptAndRead(); // Initialize : priming input
		
//		while (grade != 9999) {// Loop test : sentinel
		while(true) {
			
			if((int)grade == 9999) {
				break;
			}
			
		      //
			runningTotal += grade ; 
			count ++;
			//TODO replace with getAndValidate()
			grade = getAndValidate();//promptAndRead(); // Update : get next grade
		} // while
		
		if (count > 0) // Guard against divide −by−zero 
			return runningTotal / count; // Return the average
		else
		return -1;
	}

	/**
	 * 
	 * Code from Figure 6.10 p. 269
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		GradeAverage avg = new GradeAverage();
		
		double gradeAvg = avg.calculateAverage();
		
		if(gradeAvg<0) System.out.println("No grades enetered");
		else System.out.println("Average is: "+gradeAvg);
		
		

	}

}
