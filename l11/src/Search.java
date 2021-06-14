import java.util.Arrays;

public class Search {
	
	
	private int count=0;
	
	public int getNumOfIterations() {
		return this.count +1;
	}
	
	
	/**
	 * @param arr
	 * @param key
	 * @return index where key is found, -1 if not found
	 */
	public int sequentialSearch(int[] arr, int key) {
		//TODO implement sequential search.
		
		this.count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
			this.count++;
		}
		
		//key not found
		return -1;
		
	}
	
	/**
	 * @param arr
	 * @param key
	 * @param verbose if true, add additional prints
	 * @return index where key is found, -1 if not found
	 */
	public int binarySearch(int[] arr, int key, boolean verbose) {
		
		//TODO implement binary search
		int low = 0;
		int high = arr.length-1;
		
		
		int mid=0;
		
		this.count=0;
		
		while(low<=high) {
			
			mid = (low+high)/2;
			if(verbose) {
				//print header the first time only
				if(count==0) {
					System.out.println("count\tlow\thigh\tmid\tarr[mid]");
				}
				System.out.println(""+count+"\t"+low+"\t"+high+"\t"+mid+"\t"+arr[mid]);
			}
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid]>key) {
				high = mid-1;
			}else {
				low = mid+1;
			}
			
			this.count++;
			
		}
		
		//arrive here if key was not found
		if(verbose) {
			System.out.println(""+count+"\t"+low+"\t"+high+"\t"+mid+"\t"+arr[mid]);
		}
		
		return -1;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Search s = new Search();
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println(Arrays.toString(a));
		int key = -1;
		System.out.println("Sequential: element "+key+
				" is at index "+s.sequentialSearch(a, key)+
				" found in "+s.getNumOfIterations()+" iterations.");
		int idx = s.binarySearch(a, key, true);
		System.out.println("Binary: element "+key+
				" is at index "+idx+
				" found in "+s.getNumOfIterations()+" iterations.");

	}

}
