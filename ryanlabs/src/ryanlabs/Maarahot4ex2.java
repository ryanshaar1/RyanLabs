package ryanlabs;
import java.util.*;

public class Maarahot4ex2 {
	public static int[] getAskedValues(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num > 0) {
                count++;
            }
        }
        int[] positiveNumbers = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num > 0) {
                positiveNumbers[index] = num;
                index++;
            }
        }
        return positiveNumbers;
    }

    public static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] getSortedArrPoNe(int[] array1, int[] array2, char type) {
        int size1 = array1.length;
        int size2 = array2.length;
        int[] result = new int[size1 + size2];
        if (type == 'A') {
            System.arraycopy(array1, 0, result, 0, size1);
            System.arraycopy(array2, 0, result, size1, size2);
        } else if (type == 'P') {
            System.arraycopy(array2, 0, result, 0, size2);
            System.arraycopy(array1, 0, result, size2, size1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbersArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number at index " + i + ": ");
            numbersArray[i] = scanner.nextInt();
        }

        int[] getAskedValues = getAskedValues(numbersArray);

        System.out.println("Array with positive values: ");
        printArray(getAskedValues);

        int[] combinedArrays1 = getSortedArrPoNe(numbersArray, getAskedValues, 'A');
        int[] combinedArrays2 = getSortedArrPoNe(numbersArray, getAskedValues, 'P');

        System.out.println("Array with negative values first: ");
        printArray(combinedArrays1);

        System.out.println("Array with positive values first: ");
        printArray(combinedArrays2);
    }
}

