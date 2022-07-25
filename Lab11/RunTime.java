/**
 * This program is to compute and report the execution times
 * for the sorting algorithms, we defined in Sorting class,
 * for different size arrays. 
 */
 
import java.util.*;

public class RunTime {
    private static int[] SAMPLE_SIZES = new int[] { 100, 1000, 5000, 10000, 50000, 100000 };

    public static void main(final String[] args) {
        executionTimeReport();
    }

    /**
     * Generates a random array of size 'size'.   
     * @param size the size of the array
     * @return an array with random integers
     */
    public static int[] generateRandomArray(int size)
	{
		int [] rarr = new int[size];
		Random rand = new Random();
		for (int c= 0; c< rarr.length; c++)
		{				
			rarr[c] = rand.nextInt(1000);
		}
		
	    return rarr;
	}
    
    /**
     * To do: replace System.out.format("%7d      |", 0)
     * with System.out.format("%7d      |", endTime - startTime)
     */
    private static void executionTimeReport() {
    	 long startTime;
    	 long endTime;
         
    	 System.out.println("Arrays size |  Selection  |   Insertion   |     Merge    |    Quick    |");
    	 System.out.print("========================================================================\n");
    	 
    	 for (int i =0; i< SAMPLE_SIZES.length;i++) {
        	int size = SAMPLE_SIZES[i]; 
            
            System.out.print(String.format("  %6d    |",size));

            int[] randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.selectionSort(randomArray);
    		endTime = System.currentTimeMillis();

    		System.out.format("%7d      |",  endTime - startTime);

    		randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.insertionSort(randomArray);
    		endTime = System.currentTimeMillis();
 
    		
    		System.out.format("%7d        |",  endTime - startTime);

    		randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.mergeSort(randomArray);
    		endTime = System.currentTimeMillis();
    		
    		System.out.format("%7d       |",  endTime - startTime);
    		    		
    		randomArray = generateRandomArray(size);
            startTime = System.currentTimeMillis();
    		Sorting.quickSort(randomArray);
    		endTime = System.currentTimeMillis();
    		
    		System.out.format("%7d      |\n",  endTime - startTime);

        }
    	System.out.print("========================================================================\n");
     }

}
