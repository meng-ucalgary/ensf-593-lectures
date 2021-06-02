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
		StringTokenizer tok = new StringTokenizer(s);
		StringBuffer buf = new StringBuffer();
		
		while(tok.hasMoreTokens()) {
			String word = tok.nextToken();
			buf.append(encode(word));
			buf.append(" ");
			
			
		}
		return buf.toString();
		
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
		StringTokenizer tok = new StringTokenizer(s);
		StringBuffer buf = new StringBuffer();
		
		while(tok.hasMoreTokens()) {
			String word = tok.nextToken();
			buf.append(decode(word));
			buf.append(" ");
			
			
		}
		return buf.toString();
		
	}
	

	//TODO add abstract encode
	public abstract String encode(String s);
	
	//TODO add abstract decode
	public abstract String decode(String s);
	
	
}
