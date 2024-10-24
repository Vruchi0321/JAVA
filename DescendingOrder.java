package arrays;
//Java Program to Sort the Elements in Descending Order
import java.util.*;
public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {0, 1, 2, 3, 4, 5,6,7,8,9 };

        // Sorting the array in descending order
        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));
	}

}
