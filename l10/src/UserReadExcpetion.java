
/**
 * Using try-catch to handle user input.
 *
 */
public class UserReadExcpetion {

	/**
	 * 
	 * Uses a while loop and try-catch to
	 * prompt user until a valid integer is entered.
	 * 
	 * @param reader a KeyboardReader
	 * @return valid integer entered by the user
	 */
	public static int getIntFromUser(KeyboardReader reader) {
		
		//TODO implement this method
		
		int num = 0;
//		boolean isValid = false;
		
//		while(!isValid) {
		while(true) {
			
			reader.prompt("Please enter an integer: ");
			try {
				num = reader.getKeyboardInt();
//				isValid = true;
				break;
			}catch(NumberFormatException e) {
				System.out.println("Problem: "+e.getMessage()+" cannot convert to integer.");
				System.out.println("Please try again, e.g. 10");
			}
			
		}
		
		return num;
		
		
	}
	
	/**
	 * 
	 * Uses a while loop and try-catch to
	 * prompt user until a valid double is entered.
	 * 
	 * @param reader a KeyboardReader
	 * @return valid double entered by the user
	 */
	public static double getDoubleFromUser(KeyboardReader reader) {
		
		//TODO implement this method
		//TODO Hint Double.NaN exists and can be checked with Double.isNaN()
		
		double num = Double.NaN;
		
		while(Double.isNaN(num)) {
			
			reader.prompt("Please enter a double: ");
			try {
				num = reader.getKeyboardDouble();
			}catch(NumberFormatException e) {
				System.out.println("Problem: "+e.getMessage()+" cannot convert to double.");
				System.out.println("Please try again, e.g. 10.0");
			}
			
		}
		
		return num;
		
	}
	
	public static void main(String[] args) {
		
		KeyboardReader reader = new KeyboardReader();
		
//		System.out.println(getIntFromUser(reader));
		
		System.out.println(getDoubleFromUser(reader));
		

	}

}
