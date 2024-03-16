package ryanlabs;
import java.util.*;
	public class Maarahot3ex3 {

		    public static void main(String[] args) {

		        int[] arr = {1, 2, 3, 4, 7, 6}; 


		        System.out.println(isHalfInOrder(arr)); 
		    }

		    public static boolean isHalfInOrder(int[] arr) {
		        if (arr == null || arr.length < 2) {

		            System.out.println("Array is too small.");
		            return false; 
		        }

		        int sortedCount = 0;

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i - 1] <= arr[i]) {

		                sortedCount++;

		                if (sortedCount >= arr.length / 2) {

		                    return true;
		                }
		            } else {

		                sortedCount = 0;
		            }
		        }

		        return false; 
		    }
		}