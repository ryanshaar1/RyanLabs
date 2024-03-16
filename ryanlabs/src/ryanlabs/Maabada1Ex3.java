package ryanlabs;

import java.util.Scanner;

public class Maabada1Ex3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the total number of parking spaces: ");
        int totalSpaces = reader.nextInt();
        int maxCapacity = totalSpaces;  
        int availableSpaces = maxCapacity;  

        while (availableSpaces > 0) {
            System.out.println("Available parking spaces: " + availableSpaces);
            System.out.print("Enter the height (in meters) of the vehicle: ");
            double height = reader.nextDouble();
            System.out.print("Enter the weight (in tons) of the vehicle: ");
            double weight = reader.nextDouble();

            boolean canEnter = canVehicleEnter(height, weight);
            if (canEnter) {
                System.out.println("Vehicle can enter the parking lot.");
                availableSpaces--;
            } else {
                System.out.println("Vehicle cannot enter the parking lot.");
            }
        }

        System.out.println("All parking spaces are occupied. Parking lot is full.");
    }


    public static boolean canVehicleEnter(double height, double weight) {
        return height < 5.0 && weight < 10.0;
    }
}


