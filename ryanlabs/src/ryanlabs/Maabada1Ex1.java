package ryanlabs;

import java.util.Scanner;




public class Maabada1Ex1 {
    

    public static int countEven(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
    

    public static int NumberWithMostEvenDigits(int[] numbers) {
        int maxCount = 0;
        int result = 0;
        
        for (int number : numbers) {
            int evenDigitCount = countEven(number);
            if (evenDigitCount > maxCount) {
                maxCount = evenDigitCount;
                result = number;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        
        
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int numberWithMostEvenDigits = NumberWithMostEvenDigits(numbers);
        
        System.out.println("Number with the most even digits: " + numberWithMostEvenDigits);
        
        scanner.close();}
    
}