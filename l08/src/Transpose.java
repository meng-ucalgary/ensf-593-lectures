
/**
 * 
 * ReferenceFig 8.16
 * 
 * @author pauc
 *
 */
public class Transpose extends Cipher{

	//TODO override encode()
	@Override
	public String encode(String s) {
		StringBuffer buf = new StringBuffer(s);
		return buf.reverse().toString();
	}

	//TODO override decode()
	@Override
	public String decode(String s) {
		// TODO Auto-generated method stub
		return encode(s);
	}

	

	
	

}
