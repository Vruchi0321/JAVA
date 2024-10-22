//create a MD array and make copy and print both original and copy array(cloning)
package arrays;
import java.util.Arrays;
public class CopyArray {
	 public static void main(String[] args) {
	        // Create a multidimensional array
	        int[][] originalArray = {
	            {79, 20, 33},
	            {41, 92, 873},
	            {73, 52, 23}
	        };

	        // Make a copy of the original array
	        int[][] copiedArray = new int[originalArray.length][];
	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i].clone();
	        }

	        // Print the original array
	        System.out.println("Original Array:");
	        printArray(originalArray);

	        // Print the copied array
	        System.out.println("Copied Array:");
	        printArray(copiedArray);
	    }

	    // Method to print a multidimensional array
	    public static void printArray(int[][] array) {
	        for (int[] row : array) {
	            System.out.println(Arrays.toString(row));
	        }
	    }
	}

  

