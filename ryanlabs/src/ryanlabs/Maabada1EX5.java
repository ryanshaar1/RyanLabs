package ryanlabs;

import java.util.Scanner;

public class Maabada1EX5 {


    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


    public static void findNumbersWithSameDigitSum(int num) {
        System.out.println("Numbers with the same sum of digits as " + num + ":");
        for (int i = 1; i < num; i++) {
            if (sumOfDigits(i) == sumOfDigits(num)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            findNumbersWithSameDigitSum(num);
        }
    }
}
