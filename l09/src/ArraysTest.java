import java.util.Locale;

public class ArraysTest {

	/**
	 * 
	 * up- or down-size a 1D array
	 * 
	 * @param array input
	 * @param newSize
	 * @return new 1D array with desired size, items copied from input.
	 */
	public static double[] resizeArray(double[] array, int newSize) {
		
		//TODO implement
	}
	
	/**
	 * 
	 * up- or down-size a 1D array with custom default value.
	 * 
	 * uses fillArray()
	 * 
	 * @param array
	 * @param newSize
	 * @param defaultValue for new elements
	 * @return new 1D array with desired size, items copied from input.
	 */
	public static double[] resizeArray(double[] array, int newSize, double defaultValue) {
		
		//TODO implement
	}
	
	/**
	 * 
	 * up- or down-size a 2D array
	 * 
	 * @param array
	 * @param newRowSize
	 * @param newColSize
	 * @return new 2D array with desired size, items copied from input.
	 */
	public static double[][] resizeArray(double[][] array, int newRowSize, int newColSize) {
		
		//TODO implement
	}
	
	/**
	 * 
	 * up- or down-size a 2D array with custom default value
	 * 
	 * uses fillArray()
	 * 
	 * @param array
	 * @param newRowSize
	 * @param newColSize
	 * @param defaultValue for new elements
	 * @return new 2D array with desired size, items copied from input.
	 */
	public static double[][] resizeArray(double[][] array, 
										int newRowSize, int newColSize,
										double defaultValue) {
		//TODO implement
		
	}
	
	
	/**
	 * 
	 * Fill all elements of 1D array with value
	 * 
	 * modifies array.
	 * 
	 * @param array
	 * @param value
	 */
	public static void fillArray(double[] array, double value) {
		//TODO implement
	}
	
	/**
	 * 
	 * Fill all elements of 2D array with value
	 * 
	 * modifies array.
	 * 
	 * uses 1D version of fillArray()
	 * 
	 * @param array
	 * @param value
	 */
	public static void fillArray(double[][] array, double value) {
		//TODO implement
	}
	
	public static void printArray(double[] array) {
		//TODO implement
	}
	
	public static void printArray(double[][] array) {
		//TODO implement
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.CANADA);
		
		//--- 1D --------
		System.out.println("\n--- 1D --------\n");
		double[] d = {1., 2., 3.};
		
		printArray(d);
		
		//Test up-size with default value
		d = resizeArray(d, 10, -1.);
		
		printArray(d);
		
		//Test down-size
		d = resizeArray(d, 5);
		
		printArray(d);
		
		
		//--- 2D --------
		System.out.println("\n--- 2D --------\n");
		double[][] dd = {{1., 2., 3.}, {4., 5., 6.}};
		
		printArray(dd);
		
		//Test up-/down-size
		dd = resizeArray(dd, 3, 2);
		
		printArray(dd);
		
		//Test up-/down-size with default value
		dd = resizeArray(dd, 4, 4, -1.);
		
		printArray(dd);
	}

}
