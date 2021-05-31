public class PasswordGeneratorDev {

	public static void main(String[] args) {
		
		int numberOfChars = 10;
		
		// String allPossible = "ABC...abc...0123";

		char randomChar = 'A';
		
		char startChar = 'A';
		char endChar = 'Z';
		
		int i = 0;
		
		
		String password ="";


		// create a loop for numberOfChars
		while(i < numberOfChars) {
			//Create a random number and convert it to an upper case character
			// adding 1 to difference to handle random edge case 1.0 not included.
			randomChar = (char)(startChar + (1+endChar-startChar) * Math.random());
			password += randomChar;
			
			// TODO Instead of above:
			// pick one of the allPossible characters with a random number
			// allPossible.charAt(random number);
			
			
			i++;
		}
		System.out.println(password);

	}

}
