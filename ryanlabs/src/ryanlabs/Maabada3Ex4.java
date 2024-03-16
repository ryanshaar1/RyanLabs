package ryanlabs;

import java.util.Scanner;
public class Maabada3Ex4 {
	public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
                      

        int pairCount = 0;

        while (true) {
            System.out.print("Enter the first natural number: ");
            int num1 = reader.nextInt();

            System.out.print("Enter the second natural number: ");
            int num2 = reader.nextInt();

            int sum1 = sumDigit(num1);
            int sum2 = sumDigit(num2);

            int numDigits1 = numDigit(num1);
            int numDigits2 = numDigit(num2);

            System.out.println("For: " + num1 + ", " + num2);

            if (sum1 == sum2 && numDigits1 == numDigits2) {
                System.out.println("The sum of digits and the number of digits are the same.");
            } else {
                System.out.println("The sum of digits is different.");
            }

            if(sum1>sum2)
            System.out.println("Absolute difference in sum of digits: " +(sum1 - sum2));
            else
            System.out.println("Absolute difference in sum of digits: " +(sum2 - sum1));

            pairCount++;

            if (sum1 == sum2 && numDigits1 == numDigits2) {
                System.out.println("Pairs with the same sum of digits and number of digits: " + pairCount);
                break;
            }
        }

        reader.close();
    }

    public static int sumDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int numDigit(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}



