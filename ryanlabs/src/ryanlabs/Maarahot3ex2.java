package ryanlabs;
import java.util.*;
	public class Maarahot3ex2 {
	    public static void main(String[] args) {
	        int[] array = {5, 3, 8, 5, 2, 8, 9};
	        int result = big(array);
	        System.out.println("Index of the largest element: " + result);
	    }

	    public static int big(int[] arr) {


	        int maxIndex = 0; 
	        int maxValue = arr[0]; 

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > maxValue) {

	                maxValue = arr[i];
	                maxIndex = i;
	            } else if (arr[i] == maxValue && i < maxIndex) {

	                maxIndex = i;
	            }
	        }

	        return maxIndex;
	    }
	}

	
