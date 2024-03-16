package ryanlabs;

import java.util.*;
  


public class maabada3Ex1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        
        
        while (true) {
            System.out.print("Enter the first integer (or 999 to exit): ");
            int num1 = scanner.nextInt();
            if (num1 == 999) {
                break;
            }

            System.out.print("Enter the second integer (or 999 to exit): ");
            int num2 = scanner.nextInt();
            if (num2 == 999) {
                break;
            }

            // Print 5 random even numbers in the range
            System.out.println("5 Random Even Numbers in the Range:");
            for (int i = 0; i < 5; i++) {
                int randomNum = getRandomNumberInRange(num1, num2);
                if (randomNum % 2 != 0) {
                    randomNum++;  // Ensure the number is even
                }
                System.out.println(randomNum);
            }
        }

        scanner.close();
    }

    public static int getRandomNumberInRange(int num1, int num2) {
        if (num1 < num2) {
            return num1 + (int) (Math.random() * (num2 - num1 + 1));
        } else {
            return num2 + (int) (Math.random() * (num1 - num2 + 1));
        }
    }
}