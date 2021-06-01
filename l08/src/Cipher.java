import java.util.StringTokenizer;

/**
 * 
 * Fig 8.14 p. 359
 * 
 * TODO add encrypt(), decrypt(), encode(), decode();
 * 
 * @author pauc
 *
 */
public abstract class Cipher {

	/**
	 * 
	 * Splits text on space, 
	 * call encode on words and 
	 * concatenate encrypted words with space.
	 * 
	 * @param s text
	 * @return concatenated encrypted words
	 */
	public String encrypt(String s) {
		return "";
		
	}
	
	/**
	 * 
	 * Splits text on space, 
	 * call decode on words and 
	 * concatenate decrypted words with space.
	 * 
	 * @param s text
	 * @return concatenated decrypted words
	 */
	public String decrypt(String s) {
		return "";
		
	}
	

	//TODO add abstract encode
	
	
	//TODO add abstract decode
	
	
}
