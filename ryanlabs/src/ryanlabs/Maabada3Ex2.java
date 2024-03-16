package ryanlabs;
import java.util.Scanner;

public class Maabada3Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        

        double totalWeightedSum = 0;


        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();


        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the credits for subject " + i + ": ");
            int credits = scanner.nextInt();

            System.out.print("Enter the grade for subject " + i + ": ");
            double grade = scanner.nextDouble();


            double additionalPoints = 0;
            if (credits == 5) {
                additionalPoints = 20;
            } else if (credits == 4) {
                additionalPoints = 10;
            }


            double weightedSum = grade + additionalPoints;
            totalWeightedSum = totalWeightedSum + weightedSum;

        }


        double weightedAverage = totalWeightedSum /numSubjects ;
        System.out.println("Weighted Average: " + weightedAverage);

        scanner.close();
    }
}


