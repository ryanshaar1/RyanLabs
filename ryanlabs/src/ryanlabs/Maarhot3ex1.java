package ryanlabs;
import java.util.*;
public class Maarhot3ex1 {

	    public static void printPartOfArr(int[] arr, int num) {
	        if (num % 2 == 0) {
	            for (int i = 0; i < arr.length; i += 2) {
	                System.out.print(arr[i] + " ");
	            }
	        } else {
	            for (int i = 1; i < arr.length; i += 2) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = new int[30];

	        int randNum = (int) (Math.random() * 10) + 1;

	        System.out.println("A number was drawn: " + randNum);

	        if (randNum % 2 == 0) {
	            System.out.println("Printing organs in even places followed by odd places:");
	            printPartOfArr(arr, randNum);
	        } else {
	            System.out.println("Printing organs in odd places followed by even ones:");
	            printPartOfArr(arr, randNum);
	        }
	    }
	}

