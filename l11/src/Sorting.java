import java.util.Arrays;

public class Sorting {

	/**
	 * @param arr array to sort in-place
	 * @param verbose if true, additional prints to track progress
	 */
	public static void insertionSort(int[] arr, boolean verbose) {
		
		//TODO implement insertionSort
		

//			if(verbose) {
//				System.out.print("k="+k+": ");
//				System.out.println(Arrays.toString(arr));
//			}
		
	}

	/**
	 * @param arr array to sort in-place
	 * @param verbose if true, additional prints to track progress
	 */
	public static void insertionSort(Comparable[] arr, boolean verbose) {
		
		//TODO implement insertionSort
		

//			if(verbose) {
//				System.out.print("k="+k+": ");
//				System.out.println(Arrays.toString(arr));
//			}
		
	}

	/**
	 * @param arr array to sort in-place
	 * @param verbose if true, additional prints to track progress
	 */
	public static void selectionSort(int[] arr, boolean verbose) {
		
		//TODO implement selectionSort
		
//			if(verbose) {
//				System.out.print("k="+k+": ");
//				System.out.println(Arrays.toString(arr));
//			}
		
	}

	public static void main(String[] args) {

		// Testing regular insertionSort() and selectionSort()
		int[] a = {6, 12, 8, 2, 7};
		int[] aCopy = a.clone();

		System.out.println("Original array: ");
		System.out.println(Arrays.toString(a));

		System.out.println("Sorted with insertion sort: ");
		insertionSort(aCopy, true);
		System.out.println(Arrays.toString(aCopy));

		aCopy = a.clone();
		System.out.println("Sorted with selection sort: ");
		selectionSort(aCopy, true);
		System.out.println(Arrays.toString(aCopy));

		// Testing Comparable insertionSort() with Integer
		Integer[] c = {6, 12, 8, 2, 7};

		System.out.println("Original Integer array: ");
		System.out.println(Arrays.toString(c));
		System.out.println("Sorted with insertion sort: ");
		insertionSort(c, true);
		System.out.println(Arrays.toString(c));

		// Testing Comparable insertionSort() with LetterFreq
		LetterFreq[] letters = {new LetterFreq('A', 10), 
				new LetterFreq('B', 5),
				new LetterFreq('C', 8)};

		System.out.println("Original LetterFreq array: ");
		System.out.println(Arrays.toString(letters));
		System.out.println("Sorted with insertion sort: ");
		insertionSort(letters, true);
		System.out.println(Arrays.toString(letters));

	}

}



