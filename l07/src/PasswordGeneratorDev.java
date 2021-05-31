public class PasswordGeneratorDev {

	public static void main(String[] args) {
		
		int numberOfChars = 20;
		
		// String allPossible = "ABC...abc...0123";
		String allCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String allPossible = allCaps + 
							allCaps.toLowerCase() + 
							"0123456789";
//		System.out.println(allPossible);


//		char randomChar = 'A';
		
//		char startChar = 'A';
//		char endChar = 'Z';
		
		
		
		
//		String password ="";
		StringBuffer password = new StringBuffer();
		password.setLength(numberOfChars);
		


		// create a loop for numberOfChars
//		int i = 0;
//		while(i < numberOfChars) {
//		while(i < password.length()) {
		for(int i = 0; i < password.length(); i++) {
			//Create a random number and convert it to an upper case character
			// adding 1 to difference to handle random edge case 1.0 not included.
//			randomChar = (char)(startChar + (1+endChar-startChar) * Math.random());
//			password += randomChar;
			
			// TODO Instead of above:
			// pick one of the allPossible characters with a random number
			// allPossible.charAt(random number);
			// [0, 1) -> [0, allPossible.length())
			int randomIndex = (int) (allPossible.length() * Math.random());
			password.setCharAt(i, allPossible.charAt(randomIndex));
			i++;
		}
		System.out.println(password);

	}

}
