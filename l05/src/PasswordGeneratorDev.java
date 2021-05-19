public class PasswordGeneratorDev {

	public static void main(String[] args) {
		
		//TODO develop password generation.
		
		String password ="";
		
//		char startChar = 'A';
//		char endChar = 'Z';
//		
//		int letter;
//		
//		int i=0;
//		int length=10;
//		
//		while(i < length) {
//
//			letter = startChar + (int)(Math.random()*(endChar-startChar + 1));
//			password += (char)letter;
//			i++;
//		}
		
		PasswordGenerator generator = new PasswordGenerator('!', '}');
		
		password = generator.generatePassword(15);
		
		System.out.println(password);
		

	}

}
