/**
 * Implement sorting algorithms:
 * - Selection sort
 * - Insertion sort
 * - Quick sort
 * - Merge sort
 */
import java.util.Arrays;

public class Sorting {

	/**
	 * To do: Implement selection sort.
	 * @param array the array to sort
	 */
	public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) { 
            int indexMIN = i; 
            
            for (int j = i+1; j < array.length; j++) {
            	if (array[j] < array[indexMIN])  indexMIN = j; 
            }
            swap(array, indexMIN, i);
        } 
	}

	
	
	
	/**
	 * To do: Implement insertion sort.
	 * @param array the array to sort
	 */
	public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) { 
        	int pos = i - 1;
            int index = array[i]; 
  
            while (pos >= 0 && array[pos] > index) { 
            	array[pos + 1] = array[pos]; 
            	pos--; 
            } 
            
            array[pos + 1] = index; 
        } 
	}

	
	
	
	/**
	 * To do: Implement quick sort.
	 * @param array the array to sort
	 */
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	
	
	
	/**
	 * To do: Implement overloaded quick sort method.
	 * @param array the array to sort
	 * @param begin the starting index of the array to be sorted
	 * @param end the last index of the array to be sorted
	 */
	private static void quickSort(int[] array, int begin, int end) {
		// you need to write the quick sort algorithm here
		// use this method quickSort(int [], int, int) and partition(int [], int int)
		// to complete it
	       if (begin < end) { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(array, begin, end); 
	            
	            quickSort(array, begin, pi-1); 
	            quickSort(array, pi+1, end); 
	        } 
	}

	
	
	
	/**
	 * To do: Partition an array following quick sort algorithm and
	 * return the location of the pivot element.
	 * Note: You can select any element to be the pivot.
	 * @param array the array to partition
	 * @param begin the starting index of the array to be partitioned
	 * @param end the last index of the array to be partitioned
	 * @return the index of the pivot element
	 */
	private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];  
        int i = (begin - 1); // index of smaller element 
        for (int j = begin; j < end; j++) { 
            if (array[j] < pivot) { 
                i++; 
                swap(array, i, j);
            } 
        }
        
        swap(array, i + 1, end);
        return i + 1; 
	}

	
	
	
	/**
	 * Swap two elements in an array
	 * @param array the array
	 * @param i the index of the first element
	 * @param j the index of the second element
	 */
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	
	
	
	/**
	 * To do: Implement merge sort.
	 * @param array the array to sort
	 * @return the sorted array
	 */
	public static int[] mergeSort(int[] array) {
		return mergeSort(array, 0, array.length);
	}

	
	
	
	/**
	 * To do: Implement overloaded merge sort method.
	 * @param array the array to sort
	 * @param begin the starting index of the array to be sorted
	 * @param end the last index of the array to be sorted
	 */
	private static int[] mergeSort(int[] array, int begin, int end) {
		if (array.length <= 1) {
			return array;
		}
		int[] left  = Arrays.copyOfRange(array, begin, array.length / 2);
		int[] right = Arrays.copyOfRange(array, array.length / 2, end);
		
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}

	
	
	
	/**
	 * To do: Merge two sorted arrays into one and return it
	 * @param left the first array
	 * @param right the second array
	 * @return the sorted merged array
	 */
	private static int[] merge(int[] left, int[] right) {
		int leftL  = 0, rightL = 0;
		int[] mergedA = new int[right.length + left.length];
		
		for(int i = 0; i < mergedA.length; i++) {
			if(rightL >= right.length || leftL < left.length && left[leftL] <= right[rightL]) {
				mergedA[i] = left[leftL];
				leftL++;
			}
			else {
				mergedA[i] = right[rightL];
				rightL++;
			}
		}
		
		return mergedA;
	}

	
	
	
	/**
	 * To do: Test the sorting methods defined above
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// use this main method to sort a simple array
		// it will help you to test your sorting methods you defined above
		int[] data = { -2, 45, 0, 11, -9 };

		System.out.println("Unsorted: " + Arrays.toString(data));

		// sort the array using your implemented algorithm.
		// call the sorting method here:
		//quickSort(data);
		//selectionSort(data);
		//insertionSort(data);
		//data = mergeSort(data);
		
		System.out.println("sorted: " + Arrays.toString(data));
	}
	
	
	
}
