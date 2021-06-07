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
		double[] newArray = new double[newSize];
		
		int smallerIdx = Math.min(array.length, newSize);
		
		for(int i=0; i< smallerIdx ;i++) {
			
			newArray[i] = array[i];
			
		}
		
		return newArray;
		
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
		double[] newArray = new double[newSize];
		
		fillArray(newArray, defaultValue);

		int smallerIdx = Math.min(array.length, newSize);

		for(int i=0; i< smallerIdx ;i++) {

			newArray[i] = array[i];

		}

		return newArray;
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
		
		double[][] newArray = new double[newRowSize][newColSize];
		
		int smallerRowIdx = Math.min(array.length, newRowSize);
		
		for(int row=0; row< smallerRowIdx ;row++) {
			
			newArray[row] = resizeArray(array[row], newColSize);
			
		}
		
		return newArray;
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
		
		for(int i=0; i<array.length; i++) {
			array[i] = value;
		}
		
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
		for(int i=0; i<array.length; i++) {
			System.out.printf("% .2f, ", array[i]);
		}
		System.out.println("");
	}
	
	public static void printArray(double[][] array) {
		//TODO implement
		
		for(int row=0; row<array.length; row++) {
//			for(int col=0; col<array[row].length; col++) {
//				System.out.printf("% .2f, ", array[row][col]);
//			}
//			System.out.println("");
			printArray(array[row]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.CANADA);
		
		//--- 1D --------
		System.out.println("\n--- 1D --------\n");
		double[] d = {1., 2., 3.};
		double[] d1; // in case you would like to keep the original array.
		
		printArray(d);
		
		//Test up-size with default value
		d = resizeArray(d, 10, -1.);
		
		printArray(d);
//		
		//Test down-size
		d1 = resizeArray(d, 5);
		
		printArray(d);
		printArray(d1);
		
		
		//--- 2D --------
		System.out.println("\n--- 2D --------\n");
		double[][] dd = {{1., 2., 3.}, {4., 5., 6.}};
		
		printArray(dd);
		
		//Test up-/down-size
		dd = resizeArray(dd, 4, 4);
		
		printArray(dd);
//		
//		//Test up-/down-size with default value
//		dd = resizeArray(dd, 4, 4, -1.);
//		
//		printArray(dd);
	}

}
