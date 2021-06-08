
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
		
	}
	
	public static void main(String[] args) {
		
		KeyboardReader reader = new KeyboardReader();
		
		System.out.println(getIntFromUser(reader));
		
		System.out.println(getDoubleFromUser(reader));
		

	}

}
