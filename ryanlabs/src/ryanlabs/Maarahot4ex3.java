package ryanlabs;
import java.util.*;
public class Maarahot4ex3 {
	public class RemoveDuplicates {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	        int[] arrWithoutDuplicates = removeDuplicates(arr);

	        System.out.println(Arrays.toString(arrWithoutDuplicates));
	    }
	    static int[] removeDuplicates(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return new int[0];  
	        }
	        int n = arr.length;
	        int count = 1;
	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1]) {
	                count++;
	            }
	        }
	        int[] result = new int[count];
	        result[0] = arr[0];
	        int j = 1;
	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1]) {
	                result[j] = arr[i];
	                j++;
	            }
	        }

	        return result;
	    }

}
}