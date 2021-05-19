
public class PasswordGenerator {
	
	//TODO add instance variables
	private char startChar;// = 'A';
	private char endChar;// = 'Z';
	
	public PasswordGenerator(char s, char e) {
		//TODO implement Constructor 
		startChar = s;
		endChar = e;
	}
	
	public PasswordGenerator() {
		this('A', 'Z');
	}

	
	public String generatePassword(int length) {
	
		String password ="";
		
		int letter;
		
		int i=0;
		
		while(i < length) {

			//Math.random() -> [0, 1.0)
			letter = startChar + (int)(Math.random()*(endChar-startChar + 1));
			password += (char)letter;
			i++;
		}
		
		return password;
	}

}
